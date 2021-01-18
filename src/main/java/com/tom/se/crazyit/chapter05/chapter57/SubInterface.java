package com.tom.se.crazyit.chapter05.chapter57;

/**
 * @descriptions: SubInterface
 * @author: Tom
 * @date: 2021/1/15 上午 10:59
 * @version: 1.0
 */
public class SubInterface extends BaseClassTest implements Base {
    @Override
    public void printA() {
        System.out.println(Base.a);
    }

    public static void main(String[] args) {
        Base testInterface = new SubInterface();
        testInterface.printA();
        BaseClassTest bct = new SubInterface();
        bct.printAbstract();
    }

    @Override
    public void printAbstract() {
        System.out.println("Print Abstract.");;
    }
}
interface Base{
    int a = 12;
    public void printA();
}
abstract class BaseClassTest{
    public abstract  void printAbstract();
}
