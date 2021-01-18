package com.tom.se.crazyit.chapter05.chapter53;

import com.tom.se.crazyit.chapter05.chapter53.Person;
/**
 * @descriptions: PersonTest
 * @author: Tom
 * @date: 2021/1/13 下午 10:32
 * @version: 1.0
 */
public class PersonTest {
    // 當系統加載類或者創建該類的實例時,系統自動為成員變量分配內存
    // 並在分配內存后,自動為成員變量指定初始值
    // 一個類在使用之前要經過類加載,類驗證,類準備,類解析,類初始化等幾個階段;

    public static void main(String[] args) {
        System.out.println("Person的eyenum 數量為:" + Person.eyeNum);
        Person p = new Person();

        System.out.println("p變量的name變量值是:" + p.name + "p變量的num:" + p.eyeNum);
        p.name = "孫悟空";
        p.eyeNum = 2;
        System.out.println("p變量的name變量值是:" + p.name + "p變量的eyeNum值是:" + p.eyeNum);
        System.out.println("Person類變量的name值是:" +  Person.eyeNum);
        Person p2 = new Person();
        System.out.println("p2對象的eyeNum類變量的值:" + p2.name);
    }
}
class Person{
    public String name;
    public static int eyeNum;
}
