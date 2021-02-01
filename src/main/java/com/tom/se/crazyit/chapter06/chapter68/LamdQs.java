package com.tom.se.crazyit.chapter06.chapter68;

/**
 * @descriptions: LamdaQs
 * @author: Tom
 * @date: 2021/1/17 下午 11:21
 * @version: 1.0
 */
public class LamdQs {
    public void eat(Eatable e){
        System.out.println(e);
        e.taste();
    }
    // 2.方法裡面有接口作為參數
    public void drive(Flyable f){
        // 接口被調用
        System.out.println("我正在駕駛:" + f);
        f.fly("[碧空如洗的晴日]");
    }
    public void test(Addable add){
        System.out.println("5與3之和:" + add.add(5,3));
    }

    public static void main(String[] args) {
        LamdQs lq = new LamdQs();
        // 接口方法被實現
        lq.eat(() -> {
            System.out.println("蘋果的味道不錯.");
        });
        lq.drive(weather -> {
            System.out.println("今天天氣是:" + weather);
            System.out.println("直升機飛行平穩");
        });
        lq.test((a, b) -> a + b);
    }
}
// 定義接口
interface Eatable{
    void taste();
}
interface Flyable{
    void fly(String weather);
}
interface Addable{
    int add(int a, int b);
}