package com.tom.se.crazyit.chapter06.chapter63;

/**
 * @descriptions: SingleTest
 * @author: Tom
 * @date: 2021/1/16 上午 12:44
 * @version: 1.0
 */
public class SingleTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
class Singleton{
    private static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
