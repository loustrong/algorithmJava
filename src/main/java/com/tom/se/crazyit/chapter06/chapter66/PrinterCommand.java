package com.tom.se.crazyit.chapter06.chapter66;

/**
 * @descriptions: PrinterCommand
 * @author: Tom
 * @date: 2021/1/16 下午 10:28
 * @version: 1.0
 */
public class PrinterCommand implements Command{
    @Override
    public void process(int[] target) {
        for (int tmp: target
             ) {
            System.out.println("迭代輸出目標" + tmp);
        }

    }
}
