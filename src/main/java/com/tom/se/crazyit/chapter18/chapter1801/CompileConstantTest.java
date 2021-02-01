package com.tom.se.crazyit.chapter18.chapter1801;

/**
 * @descriptions: CompileConstTest
 * @author: Tom
 * @date: 2021/1/24 上午 10:44
 * @version: 1.0
 */
public class CompileConstantTest {
    public static void main(String[] args) {
        System.out.println(MyTest.compileConstant);
    }
}

class MyTest{
    static {
        System.out.println("靜態初始化模塊");
    }
    static final String compileConstant = "瘋狂Java講義~";
}
