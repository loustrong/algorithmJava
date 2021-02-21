package com.tom.se.crazyit.chapter08.chapter88;

import java.util.*;

/**
 * @descriptions: UnmodifiableTest
 * @author: Tom
 * @date: 2021/1/19 下午 11:14
 * @version: 1.0
 */
public class UnmodifiableTest {
    public static void main(String[] args) {
        List unmodifiableList = Collections.emptyList();
        Set unmodifiableSet = Collections.singleton("瘋狂Java講義");
        Map scores = new HashMap();
        scores.put("語文",80);
        scores.put("Java", 82);
        Map unmodifiableMap = Collections.unmodifiableMap(scores);
//        unmodifiableList.add("測試元素");
//        unmodifiableSet.add("測試元素");
//        unmodifiableMap.put("語文", 90);
    }
}
