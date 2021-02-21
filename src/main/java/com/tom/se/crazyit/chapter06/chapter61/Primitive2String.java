package com.tom.se.crazyit.chapter06.chapter61;

/**
 * @descriptions: Primitive2String
 * @author: Tom
 * @date: 2021/1/15 下午 04:38
 * @version: 1.0
 *
 * 1. 利用包裝類提供的parseXxx(String s)靜態方法 (除Character之外的所有包裝都提供了方法)
 * 2. 利用包裝類提供的valueOf(String s)靜態方法
 */
public class Primitive2String {
    public static void main(String[] args) {
        String intStr = "123";
        int it1 = Integer.parseInt(intStr);
        int it2 = Integer.parseInt(intStr);
        System.out.println(it2);
        String floatStr = "4.56";
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = Float.valueOf(floatStr);
        System.out.println(ft2);

        String ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);
        String dbStr = String.valueOf(3.344);
        System.out.println(dbStr);
        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());

    }
}
