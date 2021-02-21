package com.tom.se.crazyit.chapter10.chapter102;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @descriptions: OverrideThrows
 * @author: Tom
 * @date: 2021/1/20 上午 09:30
 * @version: 1.0
 */
public class OverrideThrows {
   public void test() throws FileNotFoundException {
       FileInputStream fis = new FileInputStream("a.txt");
   }
}
 class Sub extends OverrideThrows{
    @Override
    public void test(){

    }
 }