package com.tom.se.crazyit.chapter05.chapter51;

/**
 * @descriptions: DogTest
 * @author: Tom
 * @date: 2021/1/13 下午 05:20
 * @version: 1.0
 */
public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.jump();
        d.run();
        info();
      //  靜態內部成員不能訪問非靜態內部成員
      //  dynamicMethod()
        new DogTest().dynamicMethod();
        //  info();
    }
    public static void info(){
        System.out.println("info.");
    }
    void dynamicMethod(){
        System.out.println("Dynamic method.");
    }
}
