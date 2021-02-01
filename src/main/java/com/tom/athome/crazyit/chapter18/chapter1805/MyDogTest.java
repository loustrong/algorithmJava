package com.tom.athome.crazyit.chapter18.chapter1805;

/**
 * MyDogTest
 *
 * @author Tom on 2021/1/31
 */
public class MyDogTest {
    public static void main(String[] args) {
        // 创建一个原始的GunDog对象,作为target
        Dog target = new GunDog();
        Dog dog = (Dog)MyDogProxyFactory.getProxy(target);
        dog.info();
        dog.run();
    }
}
