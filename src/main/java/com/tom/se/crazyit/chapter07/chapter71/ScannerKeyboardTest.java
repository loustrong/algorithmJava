package com.tom.se.crazyit.chapter07.chapter71;

import java.net.SocketTimeoutException;
import java.util.Scanner;

/**
 * @descriptions: ScannerKeyboardTest
 * @author: Tom
 * @date: 2021/1/18 下午 06:59
 * @version: 1.0
 */
public class ScannerKeyboardTest {
    public static void main(String[] args) {
        // System.in 代表標準輸入,就是鍵盤輸入
        Scanner sc = new Scanner(System.in);
        //  sc.useDelimiter("\n");
        while(sc.hasNext()){
            System.out.println("鍵盤輸入的內容是:" + sc.next());
        }

    }
}
