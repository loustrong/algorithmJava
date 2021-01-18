package com.tom.se.crazyit.chapter06.chapter62;

/**
 * @descriptions: Person
 * @author: Tom
 * @date: 2021/1/15 下午 05:23
 * @version: 1.0
 */
public class PersonObject {
    public static void main(String[] args) {
        Person p = new Person("孫悟空");
        System.out.println(p);
    }
}

class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
}