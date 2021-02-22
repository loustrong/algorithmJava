package com.tom.se.crazyit.review01.collection.set;

import java.util.TreeSet;

/**
 * @descriptions: TreeSetTest
 * @author: Tom
 * @date: 2021/2/22 下午 04:47
 * @version: 1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        // 輸出集合,看到集合狀態已經是已經處於排序的狀態
        System.out.println(nums);
        System.out.println(nums.first());
        System.out.println(nums.last());
        System.out.println(nums.headSet(4));
        System.out.println(nums.tailSet(5));
        System.out.println(nums.subSet(-3, 4));
    }
}
