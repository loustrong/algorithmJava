package com.tom.se.crazyit.review01.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @descriptions: MapTest
 * @author: Tom
 * @date: 2021/2/23 上午 10:23
 * @version: 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("瘋狂Java講義", 109);
        map.put("瘋狂iSO講義",10);
        map.put("瘋狂Ajax講義", 79);
        map.put("輕量級Java EE企業應用實戰", 99);
        System.out.println(map.put("瘋狂iOS講義",99));
        System.out.println(map);
        System.out.println("是否包含key值:"+ map.containsKey("瘋狂iSO講義"));
        System.out.println("是否包含Value:" + map.containsValue(99));
        for(Object key: map.keySet()){
            System.out.println(key + "-->" + map.get(key));
        }
        map.remove("瘋狂Ajax講義");
        System.out.println(map);
        // java8 新增的方法
        Map newMap = new HashMap();
        newMap.put("瘋狂Java講義", 109);
        newMap.put("瘋狂iOS講義", 99);
        newMap.put("瘋狂Ajax講義", 79);
        newMap.replace("瘋狂XML講義", 66);
        newMap.merge("瘋狂iOS講義",10,
                (oldValue, param)->(Integer)oldValue + (Integer) param);
        System.out.println(newMap);
        // key只不存在時,使用計算結果作為value值
        newMap.computeIfAbsent("Java", (key) -> ((String) key).length());
        System.out.println(newMap);
        newMap.computeIfPresent("Java", (key, value) -> (Integer) value * (Integer) value);
        System.out.println(newMap);

    }
}
