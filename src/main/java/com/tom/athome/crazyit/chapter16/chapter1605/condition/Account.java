package com.tom.athome.crazyit.chapter16.chapter1605.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Account
 *
 * @author Tom on 2021/1/23
 */
public class Account {
    private final Lock lock = new ReentrantLock();
    private final Condition cond = lock.newCondition();
    private String accountNo;
    private double balance;
    private boolean flag = false;
    public Account(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public double getBalance(){
        return this.balance;
    }
    public void draw(double drawAmount){
        lock.lock();
        try{
            if(!flag){
                cond.await();
            } else {
                System.out.println(Thread.currentThread().getName() + " 取钱:" + drawAmount);
                balance -= drawAmount;
                System.out.println("帐户余额:" + balance);
                flag = false;
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void deposit(double depositAmount){
        lock.lock();
        try{
            if(flag){
                cond.await();
            } else {
                System.out.println(Thread.currentThread().getName() + " 存款:" + depositAmount);
                balance += depositAmount;
                System.out.println("账户余额为: " + balance);
                flag = true;
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
