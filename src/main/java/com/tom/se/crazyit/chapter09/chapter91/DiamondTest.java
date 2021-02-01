package com.tom.se.crazyit.chapter09.chapter91;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @descriptions: DiamentTest
 * @author: Tom
 * @date: 2021/1/19 下午 11:26
 * @version: 1.0
 */
public class DiamondTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("瘋狂Java講義");
        books.add("瘋狂Android講義");
        books.forEach(ele -> System.out.println(ele.length()));
        Map<String, List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("西天取經路");
        schoolsInfo.put("孫悟空", schools);
        // 遍歷Map時, Map的key是String類型,Value是List<String>類型
        schoolsInfo.forEach((key, value) -> System.out.println(key + "-->" +value));
    }
}
