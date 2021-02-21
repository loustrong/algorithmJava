package com.tom.se.crazyit.chapter06.chapter67;

/**
 * @descriptions: InnerStatic
 * @author: Tom
 * @date: 2021/1/17 下午 09:33
 * @version: 1.0
 */
public class InnerStatic {
    private class In{}
    private class InnerClass{
        // 費靜態內部類不能有靜態聲明
//        static {
//            System.out.println("====");
//        }
//        private static int large;
//        private static void test(){}
        // 接口可以定義內部類
        // 默認是使用public static修飾
    }

    public static void main(String[] args) {
        // 靜態成員無法訪問非靜態成員
//        new In();
    }
}
