package com.tom.se.crazyit.chapter06.chapter68;

import com.tom.se.crazyit.chapter06.chapter66.ProcessArray;

/**
 * @descriptions: CommandTest2
 * @author: Tom
 * @date: 2021/1/17 下午 10:43
 * @version: 1.0
 */
public class CommandTest2 {
    public static void main(String[] args) {

        ProcessArray pa = new ProcessArray();
        int[] array = new int[]{3, -4, 6, 4};
        pa.process(array, (int[] target) -> {
            int sum = 0;
            for(int tmp: target){
                sum += tmp;
            }
            System.out.println("數組元素總和:" + sum);
        });
    }




}
