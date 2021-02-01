package com.tom.athome.crazyit.chapter16.chapter1604;

/**
 * JoinThread
 *
 * @author Tom on 2021/1/23
 */
public class JoinThread extends Thread{
    public JoinThread(String name){
        super(name);
    }
    public static void main(String[] args) throws InterruptedException {
        new JoinThread("新线程").start();
        for (int i = 0; i < 100; i++) {
            if(i == 20){
                JoinThread jt = new JoinThread("被Join的线程");
                jt.start();
                jt.join();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
