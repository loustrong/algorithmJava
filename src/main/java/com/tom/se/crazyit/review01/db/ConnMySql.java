package com.tom.se.crazyit.review01.db;

import java.sql.*;

/**
 * @descriptions: ConnMySql
 * @author: Tom
 * @date: 2021/2/24 上午 11:32
 * @version: 1.0
 */
public class ConnMySql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加載驅動,使用反射;
        Class.forName("com.mysql.jdbc.Driver");
        try (
                // 2. 使用DriverManager獲取數據庫連接
                // 其中返回的Connection就代表了Java程序和數據庫的連接
                // 不同數據庫的URL寫法需要查驅動文檔
                Connection conn = DriverManager.getConnection("jdbc:mysql://10.62.240.45:3306/tom-mysql-study?useSSL=false", "wcdmaria", "wistron888");
                // 使用Connection來創建一個Statement
                Statement stmt = conn.createStatement();
                /**
                 * 4. 執行SQL語句,
                 * Statement有三種執行SQL的方法:
                 * 1. execute() 可執行任何SQL語句,返回一個boolean數值,
                 * 如果執行后返回的第一個結果是ResultSet,則返回true,否則返回false
                 * 2. executeQuery() 執行select語句:返回查詢到的結果集
                 * 3.executeUpdate() 用於執行DML語句,返回一個整數
                 * 代表SQL語句影響的行數;
                 */
                ResultSet rs = stmt.executeQuery("SELECT s.*, teacher_name FROM student_table s, teacher_table" +
                        " t where t.teacher_id = s.java_teacher");
        ) {
            // ResultSet有一系列的getXxx(列索引|列名)方法,用於獲取記錄指針
            // 指向行,特定列的值,不斷使用next()將記錄指針下移一行
            // 如果移動之後記錄指針依然指向有效行,則next()方法返回true
            while(rs.next()){
                System.out.println(rs.getInt(1) + "\t"
                        + rs.getString(2 )+ "\t"
                        + rs.getString(3 ) + "\t"
                        + rs.getString(4 )+ "\t"
                );
            }
        }
    }
}
