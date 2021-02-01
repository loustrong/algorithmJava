package com.tom.athome.crazyit.chapter18.chapter1804;

import java.lang.reflect.Array;

/**
 * ArrayTest1
 *
 * @author Tom on 2021/1/31
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        try{
            Object arr = Array.newInstance(String.class, 10);
            Array.set(arr, 5, "疯狂Java讲义");
            Array.set(arr, 6, "轻量级Java EE企业应用实战");
            Object book1 = Array.get(arr,5);
            Object book2 = Array.get(arr,6);
            System.out.println(book1);
            System.out.println(book2);
        }catch(Throwable e){
            System.err.println(e);
        }
    }
}
