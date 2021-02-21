package com.tom.se.crazyit.review01.commandPattern;

import com.tom.se.crazyit.chapter06.chapter66.Command;
import com.tom.se.crazyit.chapter06.chapter66.PrinterCommand;
import com.tom.se.crazyit.chapter06.chapter66.ProcessArray;

/**
 * CommandTest
 *
 * @author Tom on 2021/2/21
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = new int[]{3,4,5,6,7};
        int[] target1 = {3,4,5,6,7};
        pa.process(target, new PrinterCommand());
        System.out.println("-------------------");
        pa.process(target, new Command() {
            @Override
            public void process(int[] target) {
                for (int tmp: target
                     ) {
                    System.out.println(tmp);
                }
            }
        });
    }
}
