package com.tom.se.crazyit.review01;

/**
 * @descriptions:
 * @author: Tom
 * @date: 2021/2/20 上午 10:54
 * @version: 1.0
 */
public class ReturnThis {
    private int age;
    private ReturnThis(){
        this.age = 0;
    }
    public ReturnThis(int age){
        this.age = age;
    }
    public ReturnThis grow(){
       this.age ++;
       return this;
    }
    public void printAge(){
        System.out.println("年齡是:" + this.age);
    }

    public static void main(String[] args) {
        ReturnThis rt = new ReturnThis();
        rt.grow().grow().grow();
        rt.printAge();
    }
}
