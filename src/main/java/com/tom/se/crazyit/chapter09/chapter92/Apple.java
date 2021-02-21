package com.tom.se.crazyit.chapter09.chapter92;

/**
 * @descriptions: Apple
 * @author: Tom
 * @date: 2021/1/19 下午 11:42
 * @version: 1.0
 *
 * 不能在靜態變量聲明中使用泛型形參
 */
public class Apple<T> {
    private T info;
    public Apple(){}
    public Apple(T info){
        this.info = info;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return this.info;
    }
    public static void main(String[] args) {
        Apple<String> a1 = new Apple<String>("蘋果");
        System.out.println(a1.getInfo());
        Apple<Double> a2 = new Apple<Double>(5.67);
        System.out.println(a2.getInfo());
    }
}
