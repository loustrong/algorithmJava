package com.tom.se.crazyit.chapter08.chapter88;

import java.util.*;

/**
 * @descriptions: SynchronizedTest
 * @author: Tom
 * @date: 2021/1/19 下午 10:42
 * @version: 1.0
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList());
        Set s = Collections.synchronizedSet(new HashSet());
        Map m = Collections.synchronizedMap(new HashMap());
    }
}
