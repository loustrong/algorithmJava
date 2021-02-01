package com.tom.se.crazyit.chapter07.chapter71;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @descriptions: ScannerFileTest
 * @author: Tom
 * @date: 2021/1/18 下午 07:03
 * @version: 1.0
 */
public class ScannerFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\GitHub\\algorithmjava\\src\\main\\java\\com\\tom\\se\\crazyit\\chapter07\\chapter71\\ScannerFileTest.java"));
        System.out.println("ScannerFileTest.java文件內容如下:");
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

    }
}
