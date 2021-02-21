package com.tom.se.crazyit.chapter05.chapter58;

/**
 * @descriptions: CompositeTest
 * @author: Tom
 * @date: 2021/1/15 下午 02:16
 * @version: 1.0
 *
 * 繼承要表達的是 'is-a'的關係
 * 組合要表達的是 'has-one'的關係
 *
 */
public class CompositeTest {
    public static void main(String[] args) {
        AnimalComposite a = new AnimalComposite();
        BirdCom b = new BirdCom(a);
        b.breath();
        b.fly();

        AnimalComposite a2 = new AnimalComposite();
        WolfCop w = new WolfCop(a2);
        w.breath();
        w.run();


    }
}
class AnimalComposite{
    private void beat(){
        System.out.println("心臟在跳動");
    }
    public void breath(){
        beat();
        System.out.println("在呼吸");
    }
}
class BirdCom {
   private AnimalComposite a;
   public BirdCom(AnimalComposite a){
       this.a = a;
   }
   public void breath(){
       a.breath();
   }
   public void fly(){
       System.out.println("我在fly");
   }
}
class WolfCop{
    private AnimalComposite a;
    public WolfCop(AnimalComposite a){
        this.a = a;
    }
    public void breath(){
        a.breath();
    }
    public void run(){
        System.out.println("陸地上奔跑");
    }
}
