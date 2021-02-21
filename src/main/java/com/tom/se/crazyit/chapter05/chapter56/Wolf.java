package com.tom.se.crazyit.chapter05.chapter56;

/**
 * @descriptions: Wolf
 * @author: Tom
 * @date: 2021/1/14 下午 05:25
 * @version: 1.0
 */
public class Wolf extends Animal{
    public Wolf(){
        super("灰太狼", 3);
        System.out.println("Wolf無參數的構造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}
class Creature{
    public Creature(){
        System.out.println("Creature 無參數的構造器");
    }
}
class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal帶一個參數的構造器,"
        + "該動物的name為" + name);
    }
    public Animal(String name, int age){
        // 使用this調用同一個重載的構造器
        this(name);
        System.out.println("Animal 帶兩個參數的構造器," + "其age為:" + age);
    }
}