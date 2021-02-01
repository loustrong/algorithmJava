package com.tom.se.crazyit.chapter06.chapter64;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @descriptions: PrivateFinalMethodTest
 * @author: Tom
 * @date: 2021/1/16 上午 01:06
 * @version: 1.0
 */
public class PrivateFinalMehodTest {
    // 1.final定義的方法不可以被複寫,如果使用 public final則其子類不可複寫
    // 2.如果是private final,如果定義相同的方法則代表是重新定義

    private final void test(){};
}
class SubTest extends PrivateFinalMehodTest{
    public void test(){}
}
