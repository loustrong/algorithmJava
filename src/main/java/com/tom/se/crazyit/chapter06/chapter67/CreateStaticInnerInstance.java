package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: CreateInnerClass
 * @author: Tom
 * @date: 2021/1/17 下午 10:11
 * @version: 1.0
 */
public class CreateStaticInnerInstance {
    public static void main(String[] args) {
        StaticOut.StaticIn in = new StaticOut.StaticIn();
    }

}
class StaticOut{
    // 定義一個靜態內部類,不使用訪問控制符
    // 即同一個包中的其他類可訪問該內部類
    static class StaticIn{
        public StaticIn(){
            System.out.println("靜態內部類的構造器");
        }
    }
}