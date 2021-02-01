package com.tom.athome.crazyit.chapter18.chapter1805;

/**
 * GunDog
 *
 * @author Tom on 2021/1/31
 */
public class GunDog implements Dog {

    @Override
    public void info() {
        System.out.println("Dog is infoing.");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
}
