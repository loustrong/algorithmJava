package com.tom.se.crazyit.chapter06.chapter66;

import java.net.InterfaceAddress;

/**
 * @descriptions: InterfaceExtensionTest
 * @author: Tom
 * @date: 2021/1/16 下午 09:52
 * @version: 1.0
 *
 * 一個類在實現接口之後,需要實現接口的所有方法
 *
 */
public class InterfaceExtensionTest {
    public static void main(String[] args) {
        System.out.println(InterfaceA.PROP_A);
        System.out.println(interfaceB.PROP_B);
        System.out.println(interfaceC.PROP_C);
    }
}
interface InterfaceA{
    int PROP_A = 5;
    void testA();
}
interface interfaceB{
    int PROP_B = 6;
    void testB();
}
interface interfaceC{
    int PROP_C = 7;
    void testC();
}

