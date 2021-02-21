package com.tom.se.crazyit.review01.commandPattern;

/**
 * PrintCommand
 *
 * @author Tom on 2021/2/21
 */
public class PrintCommand implements Command{
    @Override
    public void process(int[] target) {
        for (int tmp: target
             ) {
            System.out.println("迭代输出的目标为:" + tmp);
        }
    }
}
