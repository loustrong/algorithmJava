package com.tom.se.crazyit.review01.map;

import java.util.EnumMap;

enum  Season {
    SPRING,SUMMER,FALL, WINTER
}
public class EnumMapTest{
    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Season.class);
        enumMap.put(Season.SUMMER,"夏日炎炎");
        enumMap.put(Season.SPRING,"春暖花開");
        System.out.println(enumMap);

    }

}
