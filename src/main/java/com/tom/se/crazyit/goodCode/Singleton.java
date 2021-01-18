package com.tom.se.crazyit.goodCode;

/**
 * @descriptions: Singleton
 * @author: Tom
 * @date: 2021/1/14 下午 07:13
 * @version: 1.0
 */
public class Singleton {
    private static volatile Singleton singleton;
    Singleton(){}
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
