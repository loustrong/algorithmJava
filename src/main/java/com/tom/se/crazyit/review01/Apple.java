package com.tom.se.crazyit.review01;

/**
 * @descriptions: Apple
 * @author: Tom
 * @date: 2021/2/20 上午 11:54
 * @version: 1.0
 */
public class Apple extends Fruit{
    private int price;
    public Apple(){
        super();
    }
    public Apple(int price){
        super();
        this.price = price;
    }
    @Override
    public void info(){
       super.info();
        System.out.println("價格為:"+ this.price);
    }
}
