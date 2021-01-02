package com.tom.athome.synch;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 问题1：生产和消费毫无规律性可言，可能先消费后生产也可能先消费后生产，也就是产生了线程安全问题
 * 原因：生产和消费操作了共有的数据，并且有多条对共享数据的操作
 * 解决办法：使用同步。
 *
 * 问题2：同步以后线程安全问题解决了，但是出现了连续生产和重复消费的问题
 * 解决办法：使用等待唤醒机制
 *
 * 问题3：多生产多消费后遇到生产者和消费者同时生产和消费的问题
 * 解决方法：使用循环方法判断商品状态
 *
 * 问题4：程序出现假死状态
 * 原因：notify每次随机唤醒线程池中的一个线程，有可能是生产者也有可能是消费者，
 * 这时有可能线程池中的线程都处于等待wait状态，程序假死
 * 解决方法：最理想的办法是生产者唤醒消费者（消费者唤醒生产者），但是没有使用的方法，所以只能选择notifyAll()
 *
 *
 * 总结：每次唤醒所有线程，浪费了资源。
 * wait(),notyfy()和notifyAll属于同步函数的锁,锁在同步代码块中可以是任意对象，所以他们可以属于任意对象，但在同步函数内属于this
 * synch Bank
 *
 * @author Tom on 2021/1/2
 */
public class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;
    public Bank(int n, double initialBalnace){
        accounts = new double[n];
        Arrays.fill(accounts, initialBalnace);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
    }

    public void transfer(int from, int to, double amount) throws InterruptedException {
        bankLock.lock();
        try{
            while(accounts[from] < amount){
//                if(accounts[from] < amount){
                sufficientFunds.await();
            }
                System.out.print(Thread.currentThread());
                accounts[from] -= amount;
                System.out.printf(" %10.2f from %d to %d", amount, from, to);
                accounts[to] += amount;
                System.out.printf(" Total Balance: %10.2f%n",getTotalBalance());
                sufficientFunds.signalAll();

        }finally {
            bankLock.unlock();
        }

    }

    private double getTotalBalance() {
        bankLock.lock();
        try{
            double sum = 0;

            for(double a : accounts){
                sum += a;
            }
            return sum;
        }finally {
            bankLock.unlock();
        }
    }
    public int size(){
        return accounts.length;
    }
}
