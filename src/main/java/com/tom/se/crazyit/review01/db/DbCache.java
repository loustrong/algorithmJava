package com.tom.se.crazyit.review01.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp2.BasicDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @descriptions: DbCache
 * @author: Tom
 * @date: 2021/2/26 下午 04:53
 * @version: 1.0
 */
public class DbCache {
    public static void main(String[] args) throws SQLException, PropertyVetoException {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("org.mariadb.jdbc.Driver");
        ds.setUrl("jdbc:mariadb://10.62.240.45:3306/tom-mysql-study?useSSL=false");
        ds.setUsername("wcdmaria");
        ds.setPassword("wistron888");
        ds.setInitialSize(5);
        ds.setMinIdle(2);
        Connection conn = ds.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM student_table";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(" " + rs.getString(1) + " " + rs.getString(2));
        }
        conn.close();
        ComboPooledDataSource ds1 = new ComboPooledDataSource();
        ds1.setDriverClass("org.mariadb.jdbc.Driver");
        ds1.setJdbcUrl("jdbc:mariadb://10.62.240.45:3306/tom-mysql-study?useSSL=false");
        ds1.setUser("wcdmaria");
        ds1.setPassword("wistron888");
        ds1.setMaxPoolSize(40);
        ds1.setMinPoolSize(10);
        ds1.setInitialPoolSize(10);
        ds1.setMaxStatements(180);
        Connection conn1 = ds1.getConnection();
        Statement stmt1 = conn1.createStatement();
        String sql1 = "SELECT * FROM student_table";
        ResultSet rs1 = stmt.executeQuery(sql1);
        while(rs1.next()){
            System.out.println(" " + rs1.getString(1) + " " + rs1.getString(2));
        }
        conn.close();
    }
}
