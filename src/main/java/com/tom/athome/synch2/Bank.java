package com.tom.athome.synch2;

import java.util.Arrays;

/**
 * synchronized
 *
 * @author Tom on 2021/1/2
 */
public class Bank {
    private final double[] accounts;
    public Bank(int n, double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    /**
     * 内部锁和条件存在一定的局限。包括:
     * 不能中断一个正式试图获得锁的线程
     * 试图获得锁时不能设定超时
     * 每个锁仅有单一的条件,可能是不够的
     * 在代码中使用哪种?Lock和Condition对象还是同步方法?
     *   最好既不使用Lock/Condition也不使用synchronized关键字,在许多
     * 情况下你可以使用java.util.concurrent包中的其中一种机制，他会为
     * 你处理所有的加锁,比如使用阻塞队列来同步完成一个共同的任务,还应当研究一下并行流
     *   如果synchronized关键字适合你的程序,那么请尽量使用它,这样可以减少代码量,减少出错的几率
     * @param from
     * @param to
     * @param amount
     * @throws InterruptedException
     */
    public synchronized void trnasfer(int from, int to, double amount) throws InterruptedException {
        while(accounts[from] < amount) wait();
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d",amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n",getTotalBalace());
    }

    private synchronized double getTotalBalace() {
        double sum = 0;
        for(double a: accounts){
            sum += a;
        }
        return sum;
    }
    public int size(){
        return accounts.length;
    }
}
