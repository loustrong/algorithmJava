package com.tom.athome.crazyit.chapter18.chapter1806;

import java.lang.reflect.Array;

/**
 * CrazyitArray
 *
 * @author Tom on 2021/1/31
 */
public class CrazyitArray {
    public static <T> T[] newInstance(Class<T> compnentType, int length){
        return (T[]) Array.newInstance(compnentType,length);
    }

    public static void main(String[] args) {
        String[] arr = CrazyitArray.newInstance(String.class, 10);
        int[][] intArr = CrazyitArray.newInstance(int[].class, 5);
        arr[5] = "疯狂Java讲义";
        intArr[1] = new int[]{23,12};
        System.out.println(arr[5]);
        System.out.println(intArr[1][1]);
    }
}
