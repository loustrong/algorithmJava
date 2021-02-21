package com.tom.se.crazyit.chapter05.chapter51;

/**
 * @descriptions: ReturnThis
 * @author: Tom
 * @date: 2021/1/13 下午 09:11
 * @version: 1.0
 */
public class ReturnThis {
    public int age = 0;
    public ReturnThis grow(){
        this.age++;
        return this;
    }
    public static void main(String[] args){
        ReturnThis rt = new ReturnThis();
        rt.grow();
        rt.grow();
        rt.grow().grow();
        System.out.println(rt.age);
    }
}
