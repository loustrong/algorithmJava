package com.tom.se.crazyit.chapter4;

/**
 * @descriptions: BreakTest
 * @author: Tom
 * @date: 2021/1/12 下午 05:24
 * @version: 1.0
 */
public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j: new int[]{0,1,2,3,4}
                 ) {
                int t = i + j;
                System.out.println(t + "");
                if(t == 8){
                    System.out.println("has got 8~");
                    break;
                }
            }
        }
    }
}
