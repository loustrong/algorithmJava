package com.tom.se.crazyit.chapter06.chapter66;

/**
 * @descriptions: AddCommand
 * @author: Tom
 * @date: 2021/1/16 下午 10:30
 * @version: 1.0
 */
public class AddCommand implements Command {

    @Override
    public void process(int[] target) {
        int sum = 0 ;
        for (int tmp: target
             ) {
            sum += tmp;
        }
        System.out.println("數組元素的總和為:" + sum);
    }
}
