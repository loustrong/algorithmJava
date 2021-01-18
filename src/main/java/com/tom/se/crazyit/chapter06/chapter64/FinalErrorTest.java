package com.tom.se.crazyit.chapter06.chapter64;

import com.tom.se.crazyit.chapter05.chapter54.Person;

/**
 * @descriptions: FinalErrorTest
 * @author: Tom
 * @date: 2021/1/16 上午 12:56
 * @version: 1.0
 */
public class FinalErrorTest {
    // 定義一個final修飾的實例變量
    // 系統不會對final成員變量進行默認初始化
    // final需要默認的初始化
    final int age = 0;
    final Person p = new Person();
    Person p1 = new Person();

    public void printAge(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        new FinalErrorTest();
    }

}
