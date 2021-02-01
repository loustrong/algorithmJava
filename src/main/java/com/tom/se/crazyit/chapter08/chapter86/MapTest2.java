package com.tom.se.crazyit.chapter08.chapter86;

import java.util.HashMap;
import java.util.Map;

/**
 * @descriptions: MapTest2
 * @author: Tom
 * @date: 2021/1/19 下午 10:27
 * @version: 1.0
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map map =new HashMap();
        map.put("瘋狂Java講義", 109);
        map.put("瘋狂iOS講義", 99);
        map.put("瘋狂Ajax講義", 79);
        map.replace("瘋狂XML講義",66);
        map.merge("瘋狂iOS", 10, (oldVal, param) ->(Integer)oldVal + (Integer)param);
        map.computeIfAbsent("Java", (key) ->((String)key).length());
        System.out.println(map);
        map.computeIfPresent("Java", (key, value) ->(Integer)value * (Integer)value);
        System.out.println(map);
    }
}
