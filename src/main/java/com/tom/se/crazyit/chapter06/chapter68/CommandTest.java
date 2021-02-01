package com.tom.se.crazyit.chapter06.chapter68;

import com.tom.se.crazyit.chapter06.chapter66.Command;
import com.tom.se.crazyit.chapter06.chapter66.ProcessArray;

/**
 * @descriptions: CommandTest
 * @author: Tom
 * @date: 2021/1/17 下午 10:27
 * @version: 1.0
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = new int[]{3,-4,6,4};
        pa.process(target, new Command() {
            @Override
            public void process(int[] target) {
                int sum = 0;
                for (int tmp: target
                     ) {
                    sum += tmp;
                }
                System.out.println("數組元素的總和是:" + sum);
            }
        });
    }
}
