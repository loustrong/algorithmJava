package com.tom.athome.crazyit.chapter16.chapter1605.Lock;

/**
 * Account
 *
 * @author Tom on 2021/1/23
 */


import java.util.concurrent.locks.ReentrantLock;

/**
 * Account
 *
 * @author Tom on 2021/1/23
 */
public class Account {
    private final ReentrantLock lock = new ReentrantLock();
    private String accountNo;
    private double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 &&
                accountNo.equals(account.accountNo);
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    public void draw(double drawAmount){
        lock.lock();
        try{
            if(balance >= drawAmount){
                System.out.println(Thread.currentThread().getName() + "取钱成功!吐出钞票:" + drawAmount);
                try{
                    Thread.sleep(1);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= drawAmount;
                System.out.println("\t 余额为:" + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败!余额不足!");
            }

        } finally {
            lock.unlock();
        }

    }
}

