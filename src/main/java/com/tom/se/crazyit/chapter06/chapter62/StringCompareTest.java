package com.tom.se.crazyit.chapter06.chapter62;

import java.net.SocketTimeoutException;

/**
 * @descriptions: StringCompareTest
 * @author: Tom
 * @date: 2021/1/15 下午 09:58
 * @version: 1.0
 */
public class StringCompareTest {
    public static void main(String[] args) {
        // s1直接引用常量池中的"瘋狂Java"
        String s1 = "瘋狂Java";
        String s2 = "瘋狂";
        String 瘋狂 = "瘋狂";
        String s3 = "Java";
        // s4後面的字符串可以在編譯時就確定下來
        // s4直接引用常量池中的"瘋狂Java"
        String s4 = "瘋狂" + "Java";
        // s5後面的字符串值可以在編譯時就可以確定下來
        // s5直接應用常量池中的"瘋狂Java"
        String s5 = "瘋" + "狂" + "Java";
        // s6後面的字符串不能在編譯期確定下來
        // 不能引用常量池的字符串
        String s6 = s2 + s3;
        // 使用new調用構造器將會創建一個新的String對象
        // s7引用堆內存重創創建的String對象
        String s7 = new String("瘋狂Java");
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);
    }
}
