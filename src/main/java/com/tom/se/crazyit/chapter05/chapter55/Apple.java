package com.tom.se.crazyit.chapter05.chapter55;

/**
 * @descriptions: Apple
 * @author: Tom
 * @date: 2021/1/14 下午 03:11
 * @version: 1.0
 */
public class Apple {
    public String name;
    public String color;
    public double weight;
    public Apple(String name, String color){
        this.name = name;
        this.color = color;
    }
    public Apple(String name, String color, double weight){
        this(name, color);
        this.weight = weight;
    }


}
