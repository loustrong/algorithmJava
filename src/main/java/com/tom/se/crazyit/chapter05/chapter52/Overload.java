package com.tom.se.crazyit.chapter05.chapter52;

/**
 * @descriptions: Overload
 * @author: Tom
 * @date: 2021/1/13 下午 10:19
 * @version: 1.0
 */
public class Overload {
    public void test(){
        System.out.println("無參數");
    }
    public void test(String msg){
        System.out.println("重載的test方法:" + msg);
    }

    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.test();
        ol.test("Hello");
    }
}
