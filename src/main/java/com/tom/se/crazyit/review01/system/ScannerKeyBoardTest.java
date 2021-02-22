package com.tom.se.crazyit.review01.system;

import java.util.Scanner;

/**
 * @descriptions: ScannerKeyBoardTest
 * @author: Tom
 * @date: 2021/2/22 下午 01:25
 * @version: 1.0
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String tmp = sc.next();
            System.out.println("鍵盤輸入的內容是:" + tmp);
            if(tmp.equals("exit")){
                System.exit(0);
            }

        }
    }
}
