package com.tom.se;

/**
 * @descriptions: Test Circle1
 * @author: Tom
 * @date: 2020/12/15 下午 04:23
 * @version: 1.0
 */
public class TestCircle1 {
    public static void main(String[] args) {
        Circle1  circle1 = new Circle1();
        System.out.println("The area of circle1 is:" + circle1.getArea());
        Circle1 circle2 = new Circle1(25);
        System.out.println("The area of circle2 is:" + circle2.getArea());
        Circle1 circle3 = new Circle1(125);
        System.out.println("The area of circle3 is:" + circle3.getArea());
        circle2.radius = 100;
        System.out.println("The area of circle2 is:" + circle2.getArea());

    }
}

class Circle1{
    double radius;
    Circle1(){
        radius = 1.0;
    }
    Circle1(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * 3.14;
    }
}
