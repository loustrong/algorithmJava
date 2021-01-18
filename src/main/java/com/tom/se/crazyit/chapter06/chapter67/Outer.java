package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: Outer
 * @author: Tom
 * @date: 2021/1/17 下午 09:28
 * @version: 1.0
 */
public class Outer {
    private int outProp = 9;
    class Inner{
        private int inProp = 5;
        public void accessOuterProp(){
            System.out.println("外部類的outProp值:" + outProp);
        }
    }
    public void accessInnerProp(){
        System.out.println("內部屬性的值:" + new Inner().inProp);
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.accessInnerProp();
    }
}
