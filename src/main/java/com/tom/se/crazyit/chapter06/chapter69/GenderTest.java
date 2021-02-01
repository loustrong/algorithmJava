package com.tom.se.crazyit.chapter06.chapter69;

/**
 * @descriptions: GenderTest
 * @author: Tom
 * @date: 2021/1/18 上午 12:08
 * @version: 1.0
 */
public class GenderTest {
    public static void main(String[] args) {
        Gender g = Enum.valueOf(Gender.class,"FEMALE");
        g.name = "女";
        System.out.println(g + "代表:" + g.name);
    }
}
