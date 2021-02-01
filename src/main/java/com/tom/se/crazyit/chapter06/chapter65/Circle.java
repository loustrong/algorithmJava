package com.tom.se.crazyit.chapter06.chapter65;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

/**
 * @descriptions: Circle
 * @author: Tom
 * @date: 2021/1/16 下午 05:50
 * @version: 1.0
 *
 * 抽象類可以包含成員變量,方法(普通方法個抽象方法都可以),構造器,初始化塊和內部類(接口和枚舉)
 * 含有抽象方法的類只能定義成抽象類
 * abstract 修飾類時,表明該類是可以被繼承;當方法使用abstract修飾時,代表該方法必須是由子類實現
 * final修飾的類是不能被繼承,因此final和abstract是永遠不會放在一起
 * staticb是修飾的是屬於類,static不能跟abstract共用
 * 但是*** static和abstract是可以共同修飾靜態內部類
 *  abstract方法不能定義為private權限
 *
 */
public class Circle extends Sharp {
    private  double radius;
    public Circle(String color, double raidus){
        super(color);
        this.radius = raidus;
    }
    @Override
    public double calPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public String getType() {
        return getColor() + "圓形";
    }

    public static void main(String[] args) {
        Sharp s1 = new Triangle("黑色", 3, 4,5);
        Sharp s2 = new Circle("黃色",3);
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}
