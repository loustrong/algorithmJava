package com.tom.se.crazyit.review01.db;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @descriptions: Execute_DML_DDL
 * @author: Tom
 * @date: 2021/2/24 下午 03:40
 * @version: 1.0
 */
public class Execute_DML_DDL {
   private String driver;
   private String url;
   private String user;
   private String pass;
    // UI组件
   private JFrame jf = new JFrame("登录");
   private JTextField userField = new JTextField(20);
   private JTextField passField = new JTextField(20);
   private JButton loginButton = new JButton("登录");

   public void initParam(String paramFile) throws IOException, ClassNotFoundException {
       Properties props = new Properties();
       props.load(new FileInputStream(paramFile));
       driver = props.getProperty("driver");
       url = props.getProperty("url");
       user = props.getProperty("user");
       pass = props.getProperty("pass");
       Class.forName(driver);
       // call procedure
       try(
               Connection conn = DriverManager.getConnection(url, user,pass);
               ){
           CallableStatement cstmt = conn.prepareCall("{call add_pro(?,?,?)}");
           cstmt.setInt(1,4);
           cstmt.setInt(2,5);
           cstmt.registerOutParameter(3, Types.INTEGER);
           cstmt.execute();
           System.out.println("執行的結果是:" + cstmt.getInt(3));
       } catch (SQLException e) {
           e.printStackTrace();
       }
       loginButton.addActionListener(e ->{
           // 登陸成功則顯示"登陸成功"
           if(validate(userField.getText(),passField.getText())){
               JOptionPane.showMessageDialog(jf,"登陸成功!");
           }
           // 否則顯示失敗
           else{
               JOptionPane.showMessageDialog(jf, "鄧麗失敗!");
           }
       });
       jf.add(userField, BorderLayout.NORTH);
       jf.add(passField);
       jf.add(loginButton, BorderLayout.SOUTH);
       jf.pack();
       jf.setVisible(true);
   }
   private boolean validate(String userName,String userPass){

//        String sql = "select * from jdbc_test " +
//                "where jdbc_name='" + userName +
//                "' and jdbc_desc='" + userPass + "'";
//       System.out.println(sql);

       // 防止注入,使用如下語法
       try(
//               Connection conn = DriverManager.getConnection(url, user, pass);
//               Statement stmt = conn.createStatement();
//               ResultSet rs = stmt.executeQuery(sql)
            Connection conn = DriverManager.getConnection(url,user,pass);
            PreparedStatement pstmt = conn.prepareStatement(
                    "select * from jdbc_test where jdbc_name =? and jdbc_desc=?")
       ){
           pstmt.setString(1, userName);
           pstmt.setString(2, userPass);
           try(
                   ResultSet rs = pstmt.executeQuery();
                   ){
               if(rs.next()){
               return true;
           }
           }
//           if(rs.next()){
//               return true;
//           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
        return false;
   }
   public void executeSql(String sql) throws ClassNotFoundException, SQLException {
       try (
               Connection conn = DriverManager.getConnection(url, user, pass);
               Statement stmt = conn.createStatement()
       ) {
           boolean hasResult = stmt.execute(sql);
           // 如果执行后有ResultSet结果集
           if(hasResult){
               try(
                       ResultSet rs = stmt.getResultSet();
                       ){
                   ResultSetMetaData rsmd = rs.getMetaData();
                   int columnCount = rsmd.getColumnCount();
                   // 迭代输出ResultSet对象
                   while(rs.next()){
                       for (int i = 0; i < columnCount; i++) {
                           System.out.println(rs.getString(i + 1) + "\t");
                       }
                       System.out.println("\n");
                   }
               }
           }else{
               System.out.println("该SQL语句影响的记录有"+ stmt.getUpdateCount() + "条");
           }
       }
   }
    public void insertUseStatement() throws SQLException {
       long start = System.currentTimeMillis();
       try(
               Connection conn = DriverManager.getConnection(url,user, pass);
               Statement stmt = conn.createStatement()
               ){
           // 需要使用100条SQL语句来输入100条记录
           for (int i = 0; i < 100; i++) {
               stmt.executeUpdate("insert into student_table values(" +
                       " null, '姓名" + i + "', 1)");
           }
           System.out.println("使用Statement费时:" + (System.currentTimeMillis() - start));
       }
    }
    public void insertUsePreare() throws SQLException {
       long start = System.currentTimeMillis();
       try(
               Connection conn = DriverManager.getConnection(url, user, pass);
               PreparedStatement pstmt = conn.prepareStatement("insert into student_table values(null, ?,1)")
               ){
           for (int i = 0; i < 100; i++) {
               pstmt.setString(1, "姓名"+ i);
               pstmt.executeUpdate();
           }
           System.out.println("使用PreparedStatement费时:"+(System.currentTimeMillis() - start));
       }
    }
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Execute_DML_DDL es = new Execute_DML_DDL();
        es.initParam("mysql.ini");
        System.out.println("----------执行删除表的DDL语句-------");
        es.executeSql("drop table if exists my_test");
        System.out.println("---------------执行插入数据的DDL语句------");
        es.executeSql("create table my_test" +
                "(test_id int auto_increment primary key," +
                "test_name varchar(255))");
        System.out.println("---------执行插入数据的DML语句");
        es.executeSql("insert into my_test(test_name) " +
                "select student_name from student_table");
        System.out.println("----------执行查询数据的查询语句--------");
        es.executeSql("select * from my_test");

        es.insertUseStatement();
        es.insertUsePreare();
    }
}
