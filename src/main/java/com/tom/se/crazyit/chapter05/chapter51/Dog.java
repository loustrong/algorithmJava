package com.tom.se.crazyit.chapter05.chapter51;

/**
 * @descriptions: Dog
 * @author: Tom
 * @date: 2021/1/13 下午 05:19
 * @version: 1.0
 */
public class Dog {
    public void jump(){
        System.out.println("正在執行jump方法.");
    }
    public void run(){
        this.jump();
        System.out.println("正在執行run方法.");
    }
}
