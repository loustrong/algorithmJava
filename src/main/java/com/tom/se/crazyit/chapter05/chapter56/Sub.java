package com.tom.se.crazyit.chapter05.chapter56;

/**
 * @descriptions: Sub
 * @author: Tom
 * @date: 2021/1/14 下午 04:55
 * @version: 1.0
 */
public class Sub extends Base{
    public String color;

    public Sub(double size, String name) {
        super(size, name);
    }

    public Sub(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        Sub s = new Sub(5.6, "測試對象", "紅色");
        System.out.println(s.size + "--" + s.name + "--" + s.color);
    }
}
class Base{
    public double size;
    public String name;
    public Base(double size, String name ){
        this.name = name;
        this.size = size;
    }
}
