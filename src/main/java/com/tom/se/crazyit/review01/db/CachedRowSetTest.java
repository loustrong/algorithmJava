package com.tom.se.crazyit.review01.db;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * @descriptions: CachedRowSetTest
 * @author: Tom
 * @date: 2021/2/25 下午 06:26
 * @version: 1.0
 */
public class CachedRowSetTest
{
    private static String driver;
    private static String url;
    private static String user;
    private static String pass;
    public void initParam(String paramFile)throws Exception
    {
        // 使用Properties类来加载属性文件
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");
    }

    public CachedRowSet query(String sql)throws Exception
    {
        // 加载驱动
        Class.forName(driver);
        // 获取数据库连接
        Connection conn = DriverManager.getConnection(url , user , pass);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        // 使用RowSetProvider创建RowSetFactory
        RowSetFactory factory = RowSetProvider.newFactory();
        // 创建默认的CachedRowSet实例
        CachedRowSet cachedRs = factory.createCachedRowSet();
        // 使用ResultSet装填RowSet
        cachedRs.populate(rs);    // ①
        // 关闭资源
        rs.close();
        stmt.close();
        conn.close();
        return cachedRs;
    }
    public static void main(String[] args)throws Exception
    {
        CachedRowSetTest ct = new CachedRowSetTest();
        ct.initParam("mysql.ini");
        CachedRowSet rs = ct.query("select * from student_table");
        rs.afterLast();
        // 向前滚动结果集
        while (rs.previous())
        {
            System.out.println(rs.getString(1)
                    + "\t" + rs.getString(2)
                    + "\t" + rs.getString(3));
            if (rs.getInt("student_id") == 3)
            {
                // 修改指定记录行
                rs.updateString("student_name", "孙悟空");
                rs.updateRow();
            }
        }
        // 重新获取数据库连接
        Connection conn = DriverManager.getConnection(url
                , user , pass);
        conn.setAutoCommit(false);
        // 把对RowSet所做的修改同步到底层数据库
        rs.acceptChanges(conn);
    }
}