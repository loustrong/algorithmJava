package com.tom.se.crazyit.review01.db;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @descriptions: RowSetFactoryTest
 * @author: Tom
 * @date: 2021/2/25 下午 04:44
 * @version: 1.0
 */
public class RowSetFactoryTest {
    private static String driver;
    private static String url;
    private static String user;
    private static String pass;
    public void initParam(String paramFile) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");
    }
    public void update(String sql) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        RowSetFactory factory = RowSetProvider.newFactory();
        try(
                JdbcRowSet jdbcRowSet = factory.createJdbcRowSet()
                ){
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(pass);
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.execute();
            jdbcRowSet.afterLast();
            while(jdbcRowSet.previous()){
                System.out.println(jdbcRowSet.getString(1) + "\t"
                + jdbcRowSet.getString(2) + "\t"
                + jdbcRowSet.getString(3));
                if(jdbcRowSet.getInt("student_id") == 3){
                    jdbcRowSet.updateString("student_name","孫悟空");
                    jdbcRowSet.updateRow();
                }
            }
        }
    }
    public CachedRowSet query(String sql) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,user,pass);
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        RowSetFactory factory = RowSetProvider.newFactory();
        CachedRowSet cachedRowSet = factory.createCachedRowSet();
        cachedRowSet.populate(rs);
        rs.close();
        pstmt.close();
        conn.close();
        return cachedRowSet;

    }
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        RowSetFactoryTest rowSetFactoryTest = new RowSetFactoryTest();
        rowSetFactoryTest.initParam("mysql.ini");
//        rowSetFactoryTest.update("select * from student_table");
        CachedRowSet crs = rowSetFactoryTest.query("select * from student_table");
        crs.afterLast();
        while(crs.previous()) {
            System.out.println(crs.getString(1) + "\t"
                    + crs.getString(2) + "\t"
                    + crs.getString(3));
            if (crs.getInt("student_id") == 3) {
                crs.updateString("student_name", "孫悟空");
                crs.updateRow();
            }
        }
        // 重新獲取數據庫連接
        Connection conn = DriverManager.getConnection(url, user,pass);
        conn.setAutoCommit(false);
        crs.acceptChanges(conn);

    }
}
