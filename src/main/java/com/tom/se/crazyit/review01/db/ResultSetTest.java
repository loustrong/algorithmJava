package com.tom.se.crazyit.review01.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @descriptions: ResultSetTest
 * @author: Tom
 * @date: 2021/2/25 下午 04:03
 * @version: 1.0
 */
public class ResultSetTest {
    private String driver;
    private String url;
    private String user;
    private String pass;
    public void initParam(String paramFile) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");

    }
    public void query(String sql) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        try(
                Connection conn = DriverManager.getConnection(url,user,pass);
                PreparedStatement pstmt = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = pstmt.executeQuery()
                ) {
//            rs.last();
            int rowCount = rs.getRow();
            for (int i = 0; i < rowCount; i++) {
                rs.absolute(i);
                System.out.println(rs.getString(1) + "\t"
                        + rs.getString(2) + "\t" + rs.getString(3));
                rs.updateString(2, "學生名" + i);
                // 提交修稿
                rs.updateRow();
            }
        }
    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        ResultSetTest rst = new ResultSetTest();
        rst.initParam("mysql.ini");
        rst.query("select * from student_table");
    }
}
