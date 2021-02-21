package com.tom.se.crazyit.chapter07.chapter71;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @descriptions: SystemTest
 * @author: Tom
 * @date: 2021/1/18 下午 07:12
 * @version: 1.0
 */
public class SystemTest {
    public static void main(String[] args) throws IOException {
        Map<String,String> env = System.getenv();
        for(String name: env.keySet()){
            System.out.println(name + " --->" + env.get(name));
        }
        System.out.println(System.getenv("JAVA_HOME"));
        Properties props =  System.getProperties();
        props.store(new FileOutputStream("props.txt"),"System Properties");
        System.out.println(System.getProperty("os.name"));

    }
}
