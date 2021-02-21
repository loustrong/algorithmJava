package com.tom.se.crazyit.review01;

/**
 * CacheImmutable
 *
 * @author Tom on 2021/2/21
 */
public class CacheImmutableTest {
    public static void main(String[] args) {
        CacheImmutable c1 = CacheImmutable.valueOf("hello");
        CacheImmutable c2 = CacheImmutable.valueOf("hello");
        System.out.println(c1 == c2);
    }
}
