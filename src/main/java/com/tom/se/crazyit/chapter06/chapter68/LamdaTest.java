package com.tom.se.crazyit.chapter06.chapter68;

/**
 * @descriptions: LamdaTest
 * @author: Tom
 * @date: 2021/1/17 下午 11:37
 * @version: 1.0
 */
public class LamdaTest {
    public static void main(String[] args) {
        Runnable r = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Runner~");

            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
