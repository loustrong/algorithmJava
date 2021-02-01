package com.tom.se.crazyit.chapter09.chapter91;

/**
 * @descriptions: AnnoymousDiamond
 * @author: Tom
 * @date: 2021/1/19 下午 11:35
 * @version: 1.0
 */
public class AnnoymousDiamond {
    public static void main(String[] args) {
        Foo<String> f = new Foo<String>(){
            @Override
            public void test(String t) {
                System.out.println("test方法的t參數為:" + t);
            }
        };
        Foo<?> fo = new Foo<String>(){
            @Override
            public void test(String o) {
                System.out.println("test方法的Object參數為:" + o);
            }
        };

    }
}

interface Foo<T>{
    void test(T t);
}