package com.tom.athome.crazyit.chapter18.chapter1802;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassLoaderTester
 *
 * @author Tom on 2021/1/30
 */
public class URLClassLoaderTest {

    private static Connection conn;
    public static Connection getConn(String url,
                                     String user,String pass) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, SQLException {
        if(conn == null){
            URL[] urls = {new URL("file:mysql-connector-java-5.1.47.jar")};
            URLClassLoader myClassLoader = new URLClassLoader(urls);
            Driver driver = (Driver) myClassLoader.loadClass("com.mysql.jdbc.Driver")
                    .getConstructor().newInstance();
            Properties props = new Properties();
            props.setProperty("user", user);
            props.setProperty("password",pass);
            conn = driver.connect(url, props);

        }
        return conn;

    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, SQLException, MalformedURLException, ClassNotFoundException {
        System.out.println(getConn("jdbc:mysql://10.62.240.45:3306", "wcdmaria", "wistron888"));
    }

}
