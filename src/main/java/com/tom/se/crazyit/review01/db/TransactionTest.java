package com.tom.se.crazyit.review01.db;

import java.io.FileInputStream;
import java.rmi.ConnectIOException;
import java.sql.*;
import java.util.Properties;

/**
 * @descriptions: TransactionTest
 * @author: Tom
 * @date: 2021/2/25 下午 06:47
 * @version: 1.0
 */
public class TransactionTest
{
    private static String driver;
    private static String url;
    private static String user;
    private static String pass;
    private static Connection conn;
    public void initParam(String paramFile)throws Exception
    {
        // 使用Properties类来加载属性文件
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");
        Class.forName(driver);
        conn = DriverManager.getConnection(url , user , pass);
    }
    public void insertInTransaction(String[] sqls) throws ClassNotFoundException, SQLException {
        // 加载驱动
        try {
            DatabaseMetaData databaseMetaData = conn.getMetaData();
            System.out.println("--------Mariadb支持的表類型信息------------");
            ResultSet rsdb = databaseMetaData.getTableTypes();
            printResultSet(rsdb);
            // 关闭自动提交，开启事务
//            conn.setAutoCommit(false);
//            try(
//                    // 使用Connection来创建一个Statment对象
//                    Statement stmt = conn.createStatement())
//            {
//                // 循环多次执行SQL语句
//                for (String sql : sqls)
//                {
//                   int count =  stmt.executeUpdate(sql);
//                    System.out.println("受影響的行數:" +count);
//                }
//            }
            // 提交事务
//            conn.commit();
//            Statement stmtSelect = conn.createStatement();
//            stmtSelect.execute("select * from student_table");
//            ResultSet rs = stmtSelect.getResultSet();
//            while (rs.next()){
//                System.out.println(rs.getString(1) + "---" + rs.getString(2));
//            }

        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
    }
    public void printResultSet(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        for(int i = 0; i < rsmd.getColumnCount(); i++){
            System.out.println(rsmd.getColumnName(i + 1));
        }
        System.out.println("\n");
        while(rs.next()){
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                System.out.println(rs.getString(i + 1) + "\t");
            }
            System.out.println("\n");
        }
        rs.close();

    }
    public void batchInsert(String[] sqls) throws Exception {
        conn.setAutoCommit(false);
        boolean autoCommit = conn.getAutoCommit();
        conn.setAutoCommit(false);
        try(Statement stmt = conn.createStatement()){
          for(String sql: sqls){
              stmt.addBatch(sql);
          }
          stmt.executeLargeBatch();
//          stmt.executeLargeBatch();
//            conn.rollback();
            int i = 1;
            if(i == 1) {
            throw new Exception("error!");
//                conn.rollback();
            }
          conn.commit();
          conn.setAutoCommit(autoCommit);
        }
        conn.commit();
    }
    public static void main(String[] args) throws Exception
    {
        TransactionTest tt = new TransactionTest();
        tt.initParam("mysql.ini");
        String[] sqls = new String[]{
                "insert into student_table values(null , 'aaa' ,1)",
                "insert into student_table values(null , 'bbb' ,1)",
                "insert into student_table values(null , 'ccc' ,1)",
//                "select * from student_table",
                // 下面这条SQL语句将会违反外键约束，
                // 因为teacher_table中没有ID为5的记录。
//                "insert into student_table values(null , 'ccc' ,5)" //①
        };
        tt.insertInTransaction(sqls);
        String[] sql2 = new String[]{
                "insert into student_table values(null , '777' ,1)",
                "insert into student_table values(null , '777' ,1)",
                "insert into student_table values(null , '777' ,1)",
        };
//        tt.batchInsert(sql2);
    }
}