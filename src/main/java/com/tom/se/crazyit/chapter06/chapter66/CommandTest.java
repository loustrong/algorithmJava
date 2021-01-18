package com.tom.se.crazyit.chapter06.chapter66;

/**
 * @descriptions: CommandTest
 * @author: Tom
 * @date: 2021/1/16 下午 10:26
 * @version: 1.0
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6,4};
        pa.process(target, new PrinterCommand());
        pa.process(target, new AddCommand());


    }
}
