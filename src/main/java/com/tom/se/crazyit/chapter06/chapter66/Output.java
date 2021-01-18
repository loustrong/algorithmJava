package com.tom.se.crazyit.chapter06.chapter66;

/**
 * 接口可以被當成是特殊的類
 *
 * 接口裡面只能包含抽象方法,靜態方法,默認方法,私有方法,不能為普通方法提供方法實現
 * 接口裡面只能定義靜態常量,不能定義普通成員變量;抽象類可以定義普通成員變量
 * 接口裡面不可以包含構造器,抽象類可以包含構造器以用於子類實現
 * 接口不能包含初始化塊,抽象類可以包含
 * 一個類最多只能有一個直接父類,包括抽象類;但是一個類可以集成多個接口
 *
 */

public interface Output {
    int MAX_CACHE_LINE = 50;
    void out();
    void getData(String msg);
    default void print(String... msgs){
        for(String msg: msgs){
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("默認的test()");
    }
    static String staticTest(){
        return "接口中的類方法";
    }
//    private static foo(){
//        System.out.println("foo私有方法");
//    }
//    private static void bar(){
//        System.out.println("bar 私有靜態方法");
//    }
 }
