package com.tom.se.crazyit.chapter08.chapter83;

import java.util.EnumSet;

/**
 * @descriptions: EnumSetTest
 * @author: Tom
 * @date: 2021/1/19 下午 05:26
 * @version: 1.0
 */
public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);
        EnumSet es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);
        EnumSet es3 = EnumSet.of(Season.SPRING,Season.SUMMER);
        System.out.println(es3);
        EnumSet es4 = EnumSet.of(Season.SPRING,Season.SUMMER);
        System.out.println(es4);
        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println(es5);
    }

}
enum Season{
    SPRING, SUMMER, FALL, WINTER;
}
