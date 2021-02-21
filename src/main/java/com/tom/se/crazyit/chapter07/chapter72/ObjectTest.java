package com.tom.se.crazyit.chapter07.chapter72;

import java.util.Objects;

/**
 * @descriptions: ObjectTest
 * @author: Tom
 * @date: 2021/1/18 下午 07:33
 * @version: 1.0
 */
public class ObjectTest {
    static Object obj;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.requireNonNull(obj,"obj參數不能是null!"));

    }
}
