package com.tom.se.crazyit.review01.file;

import java.io.*;
import java.util.Scanner;

/**
 * @descriptions: RedirectInOUt
 * @author: Tom
 * @date: 2021/2/27 下午 02:13
 * @version: 1.0
 */
public class RedifrectInOut {
    public static void main(String[] args) throws IOException {
        try(
                PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
                FileInputStream fis = new FileInputStream("\\GitHub\\algorithmjava\\src\\main\\java\\com\\tom\\se\\crazyit\\review01\\file\\FileInputStreamOutputStreamTest.java");
                ){
            System.setOut(ps);
            System.out.println("普通字符串");
            System.out.println(new RedifrectInOut());
            System.setIn(fis);
            Scanner sc = new Scanner(System.in);
//            sc.useDelimiter("\n");
            while(sc.hasNext()){
                System.out.println("鍵盤輸入的內容是:" + sc.next());
            }
        }
    }
}
