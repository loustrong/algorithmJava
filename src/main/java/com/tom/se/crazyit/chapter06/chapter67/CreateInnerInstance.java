package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: CreateInnerInstance
 * @author: Tom
 * @date: 2021/1/17 下午 10:05
 * @version: 1.0
 */
class Out{
    // 定義一個內部類,不使用訪問控制符
    // 即使用同一個包中的其他類可以訪問該內部類
    class In{
        public In(String msg){
            System.out.println(msg);
        }
    }
}
public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In  in = new Out().new In("測試信息");
        /**
         * Out.In in;
         * Out out = new Out();
         * in = out.");
         */
    }
}
