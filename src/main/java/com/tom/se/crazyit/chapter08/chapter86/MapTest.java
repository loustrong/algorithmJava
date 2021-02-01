package com.tom.se.crazyit.chapter08.chapter86;

import java.util.HashMap;
import java.util.Map;

/**
 * @descriptions: MapTest
 * @author: Tom
 * @date: 2021/1/19 下午 10:19
 * @version: 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("瘋狂Java講義", 109);
        map.put("瘋狂iOS講義", 10);
        map.put("瘋狂Ajax講義", 79);
        map.put("輕量級Java EE企業應用實戰", 99);
        System.out.println(map.put("瘋狂iOS講義", 99));
        System.out.println(map);
        System.out.println("是否包含值為:"
                + map.containsKey("瘋狂iOS講義"));
        System.out.println("是否包含值為99:"
                + map.containsValue(99));
        for(Object key: map.keySet()){
            System.out.println(key + "-->" + map.get(key));
        }
        map.remove("瘋狂Ajax講義");
        System.out.println(map);
    }
}
