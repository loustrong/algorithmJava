package com.tom.se.crazyit.chapter07.chapter73;

/**
 * @descriptions: StringBuilderTest
 * @author: Tom
 * @date: 2021/1/18 下午 07:57
 * @version: 1.0
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        sb.insert(0, "hello");
        sb.replace(5,6 ,",");
        sb.delete(5,6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.setLength(5);
        System.out.println(sb);
    }
}
