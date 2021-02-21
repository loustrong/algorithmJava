package com.tom.se.crazyit.chapter06.chapter62;

/**
 * @descriptions: EqualTest
 * @author: Tom
 * @date: 2021/1/15 下午 05:34
 * @version: 1.0
 */
public class EqualTest {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等?" + (it == fl));
        char ch = 'A';
        System.out.println("65和'A'是否相等?" + (it == ch));
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        /**
         * "hello"直接量和new String("hello"),有什麼區別呢?
         * 當Java程序直接使用形如"hello"的字符串直接量(包括可以在編譯時就計算出來的字符串值)時,
         * JVM將會使用常量池來管理這些字符串;當使用new String("hello")時,JVM會先使用常量池來管理
         * "hello"直接量,再調用String類的構造器來創建一個新的String對象,新創建的String對象被保存在
         * 堆內存中.換句話說,new String("hello")一共產生了兩個字符串對象
         * 常量池(constant pool)專門用於管理在編譯時被確定并被保存在已編譯的.class文件中的
         * 一些數據,它包括關於類,方法,接口中的常量,還包括字符串常量
         */
        System.out.println("str1和str2是否相等?" + (str1 == str2));
        System.out.println("str1和str2是否相等?" + (str1.equals(str2)));
        // 下面操作會導致編譯錯誤
//        System.out.println("hello" == new EqualTest());
    }
}
