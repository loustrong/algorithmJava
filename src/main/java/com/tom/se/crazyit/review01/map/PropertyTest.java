package com.tom.se.crazyit.review01.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @descriptions: PropertyTest
 * @author: Tom
 * @date: 2021/2/23 上午 11:38
 * @version: 1.0
 */
public class PropertyTest {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("username","tom");
        props.setProperty("password","123456");
        props.store(new FileOutputStream("a.ini"),"comment line");
        Properties props2 = new Properties();
        props2.setProperty("gender","male");
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);
    }
}
