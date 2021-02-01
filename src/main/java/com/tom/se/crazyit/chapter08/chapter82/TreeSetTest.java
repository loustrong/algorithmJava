package com.tom.se.crazyit.chapter08.chapter82;

import java.util.TreeSet;

/**
 * @descriptions: TreeSetTest
 * @author: Tom
 * @date: 2021/1/19 下午 08:04
 * @version: 1.0
 *
 * HashSet的性能總是比TreeSet好(特別是常用的添加和查詢元素等操作),
 * 因為TreeSet需要額外的紅黑樹算法來維護集合元素的次序
 * EnumSet是所有Set實現類中性能最好的,
 * HashSet,TreeSet和EnumSet都是線程不安全的
 * 通常可以通過Collection工具類的synchonizedSortedSet方法來包裝該Set集合.
 *
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);

    }
}
