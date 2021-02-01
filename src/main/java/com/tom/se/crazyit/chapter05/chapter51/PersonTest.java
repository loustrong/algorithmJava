package com.tom.se.crazyit.chapter05.chapter51;

/**
 * @descriptions: PersonTest
 * @author: Tom
 * @date: 2021/1/13 下午 05:13
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p;
        p = new Person();
        //    Person p = new Person();
        p.name = "lee gang";
        p.say("I will learn Java well.");
        System.out.println(p.name);
    }
}
