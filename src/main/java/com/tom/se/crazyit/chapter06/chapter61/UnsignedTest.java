package com.tom.se.crazyit.chapter06.chapter61;

/**
 * @descriptions: UnsignTest
 * @author: Tom
 * @date: 2021/1/15 下午 05:18
 * @version: 1.0
 */
public class UnsignedTest {
    public static void main(String[] args) {
        byte b = -3;
        System.out.println("byte類型的-3轉換為對應的無符號數:" + Byte.toUnsignedInt(b));
        int val = Integer.parseUnsignedInt("ab",16);
        System.out.println(val);
        System.out.println(Integer.toUnsignedString(-12,16));
        // 將兩個數轉換為無符號數后相除
        System.out.println(Integer.divideUnsigned(-2, 3));
        System.out.println(Integer.remainderUnsigned(-2,7));
    }
}
