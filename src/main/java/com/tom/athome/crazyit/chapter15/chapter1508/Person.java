package com.tom.athome.crazyit.chapter15.chapter1508;

/**
 * Person
 *
 * @author Tom on 2021/1/21
 */
public class Person implements java.io.Serializable {
    private String name;
    private int age;
    public Person(String name, int age){
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
