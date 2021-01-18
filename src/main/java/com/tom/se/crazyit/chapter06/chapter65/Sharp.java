package com.tom.se.crazyit.chapter06.chapter65;

/**
 * @descriptions: Sharp
 * @author: Tom
 * @date: 2021/1/16 下午 05:41
 * @version: 1.0
 */
public abstract class Sharp {
    {
        System.out.println("執行Sharp的初始化塊");
    }
    private String color;
    public abstract double calPerimeter();
    public abstract String getType();
    // 定義Sharp的構造器,該構造器不是用於創建Sharp對象
    // 而是用於被子類調用

    public Sharp() {
    }

    public Sharp(String color) {
        System.out.println("執行Sharp的構造器");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
