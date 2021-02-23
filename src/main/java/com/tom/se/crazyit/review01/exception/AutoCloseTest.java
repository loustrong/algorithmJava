package com.tom.se.crazyit.review01.exception;

import java.io.*;

/**
 * @descriptions: AutoCloseTest
 * @author: Tom
 * @date: 2021/2/23 下午 08:40
 * @version: 1.0
 */
public class AutoCloseTest {
    public static void main(String[] args) throws IOException {
        try(
                //聲明,初始化兩個可關閉的資源
                // try語句會自動關閉這兩個資源
                BufferedReader br = new BufferedReader(new FileReader("D:\\project\\algorithmJava\\com\\tom\\se\\crazyit\\review01\\exception\\AutoCloseTest.java"));
                PrintStream ps = new PrintStream(new FileOutputStream("aa.txt"))
                ){
            System.out.println(br.readLine());
            ps.println("庄生晓梦迷蝴蝶");
        }
    }
}
