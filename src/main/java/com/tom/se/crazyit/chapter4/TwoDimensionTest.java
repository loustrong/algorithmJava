package com.tom.se.crazyit.chapter4;

/**
 * @descriptions: TwoDimensionTest
 * @author: Tom
 * @date: 2021/1/12 下午 07:25
 * @version: 1.0
 */
public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][] a;
        a = new int[4][];
        for (int i = 0,len = a.length; i < len ; i++) {
            System.out.println(a[i]);
        }
        // 初始化a數組的第一個元素
        a[0] = new int[2];
        a[0][1] = 6;
        for (int i = 0,len = a[0].length; i < len; i++) {
            System.out.println(a[0][i]);

        }
        System.out.println(1<<13);
    }
}
