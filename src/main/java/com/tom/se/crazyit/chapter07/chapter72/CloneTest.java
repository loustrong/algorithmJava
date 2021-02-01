package com.tom.se.crazyit.chapter07.chapter72;

/**
 * @descriptions: CloneTest
 * @author: Tom
 * @date: 2021/1/18 下午 07:24
 * @version: 1.0
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(29);
        // clone得到的u1對象
        User u2 = u1.clone();
        System.out.println(u1 == u2);
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
        address = new Address("廣州天河");
    }
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }

}