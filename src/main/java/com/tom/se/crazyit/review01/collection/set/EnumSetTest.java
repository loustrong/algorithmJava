package com.tom.se.crazyit.review01.collection.set;

import java.util.EnumSet;

/**
 * @descriptions: EnumSetTest
 * @author: Tom
 * @date: 2021/2/22 下午 05:20
 * @version: 1.0
 */
public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet es1 =  EnumSet.allOf(EnumSetSeason.class);
        System.out.println(es1);
        EnumSet es2 =  EnumSet.noneOf(EnumSetSeason.class);
        System.out.println(es2);
        es2.add(EnumSetSeason.SPRING);
        EnumSet es4 = EnumSet.range(EnumSetSeason.SUMMER,EnumSetSeason.WINTER);
        System.out.println(es4);
    }

}
