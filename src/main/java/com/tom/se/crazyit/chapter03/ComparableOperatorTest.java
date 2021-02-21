package com.tom.se.crazyit.chapter03;

/**
 * @descriptions: ComparableOperatorTest
 * @author: Tom
 * @date: 2021/1/12 下午 05:01
 * @version: 1.0
 */
// > >= <=  只支持左右兩邊操作數是數值類型.
// == 如果進行比較的兩個操作數都是數值類型,及時他們的數據類型不相同,
// 只要他們的值相等,也都將返回true,例如 97 == 'a' 返回true
// 5.0 和 5也返回true.如果兩個操作數都是引用類型,那麼只有當兩個
// 引用變量的類型具有父子關係時,才可以比較,而且這兩個引用必須指向同一個
// 對象才會顯示為true.Java也支持兩個boolean類型的值進行比較.例如
// true == false將返回false
//

public class ComparableOperatorTest {
    public static void main(String[] args) {
        System.out.println("5是否大於4:" + (5 > 4.0));
        System.out.println("5是否和5.0相等:" + (5 == 5.0));
        System.out.println("97 和 'a'是否相等:" + (97 == 'a'));
        System.out.println("true和false是否相等:" + (true == false));
        // 創建兩個ComparableOperatorTest對象,分別賦給t1和t2兩個引用
        ComparableOperatorTest t1 = new ComparableOperatorTest();
        ComparableOperatorTest t2 = new ComparableOperatorTest();
        // t1和t2引用不同的對象,所以返回false
        System.out.println("t1是否等於t2:" + (t1 == t2));
        ComparableOperatorTest t3 = t2;
        System.out.println("t3是否等於t2:" + (t3 == t2));
    }
}
