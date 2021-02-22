package com.tom.se.crazyit.review01.test;

/**
 * @descriptions: FITest
 * @author: Tom
 * @date: 2021/2/22 上午 11:26
 * @version: 1.0
 */
public class FITest {
    public static void main(String[] args) {
        FkTest object2 =(FkTest) ()  -> {
            System.out.println("Fk Test");
        };
        object2.run();
        OneMethodClassTest oneMethodClassTest = new OneMethodClassTest();
        oneMethodClassTest.print(()-> {
            System.out.println("hello");
        });
    }
}

@FunctionalInterface
interface FkTest{
    void run();
}

interface OnlyOneMethodInterface{
    public void print();
}

class OneMethodClassTest{
    public void print(OnlyOneMethodInterface oomi){
        oomi.print();
    }
}