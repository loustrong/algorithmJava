package com.tom.se.crazyit.review01.system;

/**
 * @descriptions: CloneTest
 * @author: Tom
 * @date: 2021/2/22 下午 01:36
 * @version: 1.0
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(32);
        User u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println("--------------------");
        System.out.println(u1.address == u2.address);
    }
}

class Address{
    String detail;
    public Address(String detail){
        this.detail = detail;
    }
}
class User implements Cloneable{
    int age;
    Address address;
    public User(int age){
       this.age = age;
       address = new Address("成都雙流");
    }
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}