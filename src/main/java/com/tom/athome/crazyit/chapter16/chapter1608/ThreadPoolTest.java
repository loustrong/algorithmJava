package com.tom.athome.crazyit.chapter16.chapter1608;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadPoolTest
 *
 * @author Tom on 2021/1/23
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Runnable target = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "的i值为:" + i);
            }
        };
        pool.submit(target);
        pool.submit(target);
        pool.shutdown();
    }
}
