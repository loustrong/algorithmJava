package com.tom.se.crazyit.chapter06.chapter64;

/**
 * @descriptions: FinalMethodTest
 * @author: Tom
 * @date: 2021/1/16 上午 01:03
 * @version: 1.0
 */
public class FinalMethodTest {
    public final void test(){}
}
class Sub extends FinalMethodTest{
    // 被final修飾的方法不能被重寫
//    public void test(){
//        System.out.println("can not rewrite");
//    }
}
