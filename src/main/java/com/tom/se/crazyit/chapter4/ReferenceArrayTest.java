package com.tom.se.crazyit.chapter4;

import javax.swing.tree.FixedHeightLayoutCache;

/**
 * @descriptions: ReferenceArrayTest
 * @author: Tom
 * @date: 2021/1/12 下午 06:49
 * @version: 1.0
 */
public class ReferenceArrayTest {
    public static void main(String[] args) {
        // 定義一個students數組變量,其類型是Person[]
        Person[] students;
        students = new Person[2];
        // 創建一個Person實例,並將這個Person實例賦給zhang變量
        Person zhang = new Person();
        zhang.age = 15;
        zhang.height = 158;
        Person lee = new Person();
        lee.age = 16;
        lee.height = 161;
        students[0] = zhang;
        students[1] = lee;
        lee.info();
        students[0].info();
    }
}
