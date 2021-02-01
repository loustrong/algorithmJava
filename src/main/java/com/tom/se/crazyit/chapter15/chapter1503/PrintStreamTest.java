package com.tom.se.crazyit.chapter15.chapter1503;

import java.io.*;

/**
 * @descriptions: FileOutputStreamTest
 * @author: Tom
 * @date: 2021/1/21 下午 05:30
 * @version: 1.0
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try(
                FileOutputStream fos = new FileOutputStream("test.txt");
                PrintStream ps = new PrintStream(fos)
                ){
            ps.print("普通字符串");
            ps.println(new PrintStreamTest());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
