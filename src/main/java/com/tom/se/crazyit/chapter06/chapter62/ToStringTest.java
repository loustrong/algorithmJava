package com.tom.se.crazyit.chapter06.chapter62;

/**
 * @descriptions: ToStringTest
 * @author: Tom
 * @date: 2021/1/15 下午 05:26
 * @version: 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        Apple a = new Apple("紅色", 5.68);
        System.out.println(a);
    }
}
class Apple{
    private String color;
    private double weight;

    public Apple() {
    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "一個蘋果,顏色是:" + this.color + ", 重量是:"
                + this.weight;
    }
}
