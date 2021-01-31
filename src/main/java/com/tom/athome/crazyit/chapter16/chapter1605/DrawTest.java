package com.tom.athome.crazyit.chapter16.chapter1605;

/**
 * DrawTest
 *
 * @author Tom on 2021/1/23
 */
public class DrawTest {
    public static void main(String[] args) {
        Account account = new Account("1234567", 100);
        new DrawThread("甲", account, 800).start();
        new DrawThread("乙", account, 800).start();
    }
}
