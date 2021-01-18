package com.tom.se.crazyit.chapter05.chapter52;

/**
 * @descriptions: Varargs
 * @author: Tom
 * @date: 2021/1/13 下午 10:21
 * @version: 1.0
 */
public class Varargs {
    // 在最後一個形參的類型后增加三個點(...)
    // 則表明該形參可以接受多個參數值

    public static void test(int a, String... args) {
        for(String tmp: args){
            System.out.println(tmp);
        }
        System.out.println(a);
    }
    public static void test(String[] b, int a ){
        for(String bb: b){
            System.out.println(bb);
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        test(5, "瘋狂java講義","輕量級Java EE企業應用實戰");
        test(new String[]{"sss","ss"},3);
    }
}
