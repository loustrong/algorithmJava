package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: AnonymousTest
 * @author: Tom
 * @date: 2021/1/17 下午 10:17
 * @version: 1.0
 */
interface Product{
    public double getPrice();
    public String getName();
}
public class AnonymousTest {
    public void test(Product p){
        System.out.println("購買了一個" + p.getName() + ",花掉了"+
                p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest ta = new AnonymousTest();
        ta.test(new Product() {
            @Override
            public double getPrice() {
                return 567.8;
            }

            @Override
            public String getName() {
                return "AGP顯卡";
            }
        });
    }
}
