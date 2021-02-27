package com.tom.se.crazyit.review01.file;

import com.tom.se.crazyit.chapter15.chapter1503.PrintStreamTest;

import java.io.*;

/**
 * @descriptions: ReaderAndPrinterTest
 * @author: Tom
 * @date: 2021/2/27 上午 11:30
 * @version: 1.0
 */
public class ReaderAndPrinterTest {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream fos = new FileOutputStream("test210227.txt");
            PrintStream ps = new PrintStream(fos)){
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        }
        String src = "從明天起,做一個幸福的人";
        char[] buffer = new char[32];
        int hasRead = 0;
        try(StringReader sr = new StringReader(src)){
            while((hasRead = sr.read(buffer)) > 0){
                System.out.println(new String(buffer,0,hasRead));
            }
        }
        try(
                StringWriter sw = new StringWriter();
                ){
            sw.write("有一個美麗的新世界");
            System.out.println("下面是輸出流");
            System.out.println(sw.toString());
        }
    }
}
