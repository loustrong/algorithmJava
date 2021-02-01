package com.tom.se.crazyit.chapter05.chapter58;

/**
 * @descriptions: InheritTest
 * @author: Tom
 * @date: 2021/1/15 下午 02:10
 * @version: 1.0
 */
public class InheritTest {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.breath();
        Wolf w = new Wolf();
        w.run();
        w.breath();
    }

}
class Animal{
    private void  beat(){
        System.out.println("心臟在跳動...");
    }
    public void breath(){
        beat();
        System.out.println("吸一口氣,呼一口氣,呼吸中...");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("我在天空自由自在飛翔..");
    }
}

class Wolf extends Animal{
    public void run(){
        System.out.println("我在陸地上快速地奔跑");
    }
}