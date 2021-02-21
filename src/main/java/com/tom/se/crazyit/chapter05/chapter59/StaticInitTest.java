package com.tom.se.crazyit.chapter05.chapter59;

/**
 * @descriptions: StaticInitTest
 * @author: Tom
 * @date: 2021/1/15 下午 03:32
 * @version: 1.0
 */
public class StaticInitTest {
    static {
        a = 6;
    }
    static int a =9;
    public static void main(String[] args) {
        System.out.println(StaticInitTest.a);
    }
}
