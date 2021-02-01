package com.tom.se.crazyit.chapter09.chapter93;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @descriptions: MyUtils
 * @author: Tom
 * @date: 2021/1/19 下午 11:53
 * @version: 1.0
 */
public class MyUtils {
    public static void main(String[] args) {
        List<Number> ln = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(5);
        Integer last = copy(ln,li);
        System.out.println(ln);
    }
    public static <T> T copy(Collection<? super T> dest, Collection<T> src){
        T last = null;
        for(T ele: src){
            last = ele;
            dest.add(ele);
        }
        return last;
    }
}
