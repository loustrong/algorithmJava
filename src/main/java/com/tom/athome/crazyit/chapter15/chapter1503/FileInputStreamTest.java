package com.tom.athome.crazyit.chapter15.chapter1503;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStreamTest
 *
 * @author Tom on 2021/1/20
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\project\\algorithmJava\\src\\main\\java\\com\\tom\\athome\\crazyit\\chapter15\\chapter1503\\FileInputStreamTest.java");
        byte[] bbuf = new byte[1024];
        int hasRead = 0;
        while((hasRead = fis.read(bbuf)) > 0){
            System.out.println(new String(bbuf, 0, hasRead));
        }
        fis.close();
    }
}
