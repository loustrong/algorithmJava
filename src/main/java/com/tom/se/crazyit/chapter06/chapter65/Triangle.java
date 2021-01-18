package com.tom.se.crazyit.chapter06.chapter65;

/**
 * @descriptions: Tringle
 * @author: Tom
 * @date: 2021/1/16 下午 05:45
 * @version: 1.0
 */
public class Triangle extends Sharp {
    private double a;
    private double b;
    private double c;
    public Triangle(String color, double a, double b, double c){
        super(color);
        this.setSides(a, b, c);
    }


    public void setSides(double a, double b, double c){
        if(a > b + c || b > a + c || c > a + b){
            System.out.println("三角形兩邊之和必須大於第三邊");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public String getType() {
        return "三角形";
    }
}
