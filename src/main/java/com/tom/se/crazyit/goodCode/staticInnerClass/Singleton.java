package com.tom.se.crazyit.goodCode.staticInnerClass;

/**
 * @descriptions: staticInnerclassSingleton
 * @author: Tom
 * @date: 2021/1/14 下午 07:27
 * @version: 1.0
 */
public class Singleton {
    private Singleton(){}
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
//        Runtime;
    }
}
