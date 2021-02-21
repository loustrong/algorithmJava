package com.tom.se.crazyit.chapter08.chapter86;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @descriptions: PropertiesTest
 * @author: Tom
 * @date: 2021/1/19 下午 10:36
 * @version: 1.0
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("username","tom_lou");
        props.setProperty("password","123456");
        props.store(new FileOutputStream("a.ini"), "comment line");
        Properties props2 = new Properties();
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);
    }
}
