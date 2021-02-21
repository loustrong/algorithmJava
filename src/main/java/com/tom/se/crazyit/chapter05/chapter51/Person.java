package com.tom.se.crazyit.chapter05.chapter51;

/**
 * @descriptions: Person
 * @author: Tom
 * @date: 2021/1/13 下午 05:03
 * @version: 1.0
 */
public class Person {
    // 類是引用變量
    // 類包含的成員: 構造器,成員變量和方法
    // 三種成員可以是一個或者多個
    // static修飾后,代表該成員變量或者方法是屬於類
    // Java是通過new關鍵字來調用構造器,從而返回實例
    // 如果程序員不定義構造器, 系統會為一個類定義默認構造器



    public String name;
    public int age;
    public void say(String content){
        System.out.println(content);
    }

}
