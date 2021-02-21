package com.tom.se.crazyit.chapter06.chapter64;

/**
 * @descriptions: IntegerCacheTest
 * @author: Tom
 * @date: 2021/1/16 下午 05:20
 * @version: 1.0
 */
public class IntegerCacheTest {
    public static void main(String[] args) {
        Integer in1 = new Integer(6);
        Integer in2 = Integer.valueOf(6);
        Integer in3 = Integer.valueOf(6);
        System.out.println(in1 == in2);
        System.out.println(in2 == in3);


    }
}
