package com.tom.athome.crazyit.chapter15.chapter1509;

import java.nio.charset.Charset;
import java.util.SortedMap;

/**
 * CharsetTest
 *
 * @author Tom on 2021/1/23
 */
public class CharsetTest {
    public static void main(String[] args) {
        SortedMap<String, Charset> map = Charset.availableCharsets();
        for(String alias: map.keySet()){
            System.out.println(alias + "---->" + map.get(alias));
        }
    }
}
