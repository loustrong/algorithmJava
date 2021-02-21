package com.tom.se.crazyit.chapter05.chapter51;

/**
 * @descriptions: ThisInConstructor
 * @author: Tom
 * @date: 2021/1/13 下午 09:09
 * @version: 1.0
 */
public class ThisInConstructor {
    public int foo;
    public ThisInConstructor(){
        int foo = 0;
        this.foo = 6;
    }

    public static void main(String[] args) {
        System.out.println(new ThisInConstructor().foo);
    }
}
