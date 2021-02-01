package com.tom.se.crazyit.chapter05.chapter56;

/**
 * @descriptions: HideTest
 * @author: Tom
 * @date: 2021/1/14 下午 04:26
 * @version: 1.0
 */
public class HideTest {
    public static void main(String[] args) {
        Derived d = new Derived();
        Parent p = (Parent)d;
        System.out.println(p.tag);
//        System.out.println(d.tag);
    }

}
class Parent{
    public String tag = "瘋狂Java講義";
}
class Derived extends Parent{
    private String tag = "輕量級Java EE企業應用";
}
