package com.tom.se.crazyit.chapter06.chapter64;

/**
 * @descriptions: ImmutableStringTest
 * @author: Tom
 * @date: 2021/1/16 下午 03:57
 * @version: 1.0
 *
 * final修飾的類不可以有子類
 * 如果需要創建自定義的不可變的類,可遵循如下規則:
 * 使用private和final修飾符來修飾該類的成員變量
 * 提供帶參數的構造器,用於根據傳入參數來初始化類裡面的成員變量
 * 僅為該類的成員提供getter方法,不為該類提供setter方法,
 * 因為普通方法無法改變final修飾的成員變量
 * 如有必要,重寫Object類的hashCode()和equals方法,equals()方法
 * 根據關鍵成員變量來作為兩個對象是否相等的標準
 */
public class ImmutableStringTest {
    public static void main(String[] args) {
        //
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());


    }

}
