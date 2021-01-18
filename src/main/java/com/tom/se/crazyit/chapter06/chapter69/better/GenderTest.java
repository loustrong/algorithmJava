package com.tom.se.crazyit.chapter06.chapter69.better;

/**
 * @descriptions: GenderTest
 * @author: Tom
 * @date: 2021/1/18 上午 12:17
 * @version: 1.0
 */
public class GenderTest {
    public static void main(String[] args) {
        Gender g = Gender.valueOf("FEMALE");
        g.setName("女");
        System.out.println(g + "代表:" + g.getName());
        // 此時設置name值時將會提示參數錯誤
        g.setName("男");
        System.out.println(g + "代表:" + g.getName());
    }
}
