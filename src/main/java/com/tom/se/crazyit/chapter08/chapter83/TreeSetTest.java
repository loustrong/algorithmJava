package com.tom.se.crazyit.chapter08.chapter83;

import java.util.TreeSet;

/**
 * @descriptions: TreeSetTest
 * @author: Tom
 * @date: 2021/1/19 下午 05:21
 * @version: 1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        System.out.println(nums);
        System.out.println(nums.first());
        System.out.println(nums.last());
        System.out.println(nums.headSet(4));
        System.out.println(nums.tailSet(5));
        System.out.println(nums.subSet(-3,4));
    }

}
