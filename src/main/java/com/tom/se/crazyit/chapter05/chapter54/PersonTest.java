package com.tom.se.crazyit.chapter05.chapter54;

/**
 * @descriptions: PersonTest
 * @author: Tom
 * @date: 2021/1/14 下午 02:40
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1000);
        System.out.println("未按照規範設置age成員變量"+p.getAge());
        p.setAge(30);
        System.out.println("成功設置年齡:" + p.getAge());
        p.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("未按照規範設置名字:" + p.getName());
        p.setName("李剛");
        System.out.println("獲取名字:" + p.getName());
    }
}
