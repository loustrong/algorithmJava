package com.tom.se.crazyit.review01;

/**
 * SingleTest
 *
 * @author Tom on 2021/2/21
 */
public class SingleTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 == s2 ?" + (s1 == s2));
    }
}
class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}