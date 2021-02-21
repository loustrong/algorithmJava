package com.tom.se.crazyit.review01.commandPattern;

/**
 * ProcessArray
 *
 * @author Tom on 2021/2/21
 */
public class ProcssArray {
    public void process(int[] target, Command cmd){
        cmd.process(target);
    }
}
