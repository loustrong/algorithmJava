package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: ATest
 * @author: Tom
 * @date: 2021/1/17 下午 10:24
 * @version: 1.0
 */
public class ATest {
    public static void main(String[] args) {
        int age =8;
        A a = new A(){

            @Override
            public void test() {
                System.out.println(age);
            }
        };
    }
}
interface A{
    void test();
}