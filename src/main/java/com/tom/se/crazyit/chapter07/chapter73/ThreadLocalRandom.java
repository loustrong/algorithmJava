package com.tom.se.crazyit.chapter07.chapter73;

import java.util.Arrays;
import java.util.Random;

/**
 * @descriptions: ThreadLoacalRandom
 * @author: Tom
 * @date: 2021/1/18 下午 08:01
 * @version: 1.0
 */
public class ThreadLocalRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("rand.nextBoolean" + rand.nextBoolean());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        System.out.println("rand.nextDouble:" + rand.nextDouble());
        System.out.println("rand.nextFloat" + rand.nextFloat());
        System.out.println("rand.nextGaussian" + rand.nextGaussian());
        System.out.println("rand.nextInt" + rand.nextInt(26));
        System.out.println("rand.nextLong" + rand.nextLong());

    }
}
