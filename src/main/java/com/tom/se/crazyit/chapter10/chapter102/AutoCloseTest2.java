package com.tom.se.crazyit.chapter10.chapter102;

import java.io.*;

/**
 * @descriptions: AutoCloseTest2
 * @author: Tom
 * @date: 2021/1/20 上午 09:23
 * @version: 1.0
 */
public class AutoCloseTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        final BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest2.java"));
        PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
//        try(br;ps){
//            System.out.println(br.readLine());
//            ps.println("莊生曉夢迷蝴蝶");
//        }
        // Java的異常主要分為兩大類: Checked異常和Runtime異常.
        // 所有的RuntimeException類及其子類的實例稱為Runtime異常;不是Runtime異常
        // 則是Checked異常


    }
}
