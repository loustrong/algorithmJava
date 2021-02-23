package com.tom.se.crazyit.review01.map;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

/**
 * @descriptions: WeakHashMapTest
 * @author: Tom
 * @date: 2021/2/23 下午 01:56
 * @version: 1.0
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap whm = new WeakHashMap<>();
        whm.put(new String("語文"),new String("良好"));
        whm.put(new String("數學"),new String("及格"));
        whm.put(new String("英文"),new String("中等"));
        whm.put("java", new String("中等"));
        System.out.println(whm);
        System.gc();
        System.runFinalization();
        System.out.println(whm);
        // ---- Identity -----
        IdentityHashMap identityHashMap = new IdentityHashMap();
        identityHashMap.put(new String("語文"), 89);
        identityHashMap.put(new String("語文"), 78);
        System.out.println(identityHashMap);
        identityHashMap.put("java", 93);
        identityHashMap.put("java", 98);
        System.out.println(identityHashMap);
    }
}
