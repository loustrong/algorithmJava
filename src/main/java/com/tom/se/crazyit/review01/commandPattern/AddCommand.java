package com.tom.se.crazyit.review01.commandPattern;

/**
 * AddCommand
 *
 * @author Tom on 2021/2/21
 */
public class AddCommand implements Command{

    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int tmp: target
             ) {
            sum += tmp;
        }
        System.out.println("数组元素的总和是:" + sum);
    }
}
