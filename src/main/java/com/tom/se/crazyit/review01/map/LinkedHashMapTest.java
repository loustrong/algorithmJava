package com.tom.se.crazyit.review01.map;

import java.util.LinkedHashMap;

/**
 * @descriptions: LinkedHashMapTest
 * @author: Tom
 * @date: 2021/2/23 上午 11:34
 * @version: 1.0
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap<>();
        scores.put("語文", 80);
        scores.put("英語", 90);
        scores.put("數學", 100);
        scores.forEach(
                (key, value)-> System.out.println(key + "----" + value)
        );
    }
}
