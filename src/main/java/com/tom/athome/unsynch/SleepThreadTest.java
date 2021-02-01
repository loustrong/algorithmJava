package com.tom.athome.unsynch;

/**
 * Sleep Thread Test
 *
 * @author Tom on 2021/1/2
 */
public class SleepThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Thread One Test.");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread One after Sleep.");
        };

        Thread t = new Thread(r);
        t.start();
    }
}

class TestThread implements Runnable{

    @Override
    public void run() {
        for(int i =0; i < 10; i++){
            System.out.println("TestThread.");
        }
    }
}
