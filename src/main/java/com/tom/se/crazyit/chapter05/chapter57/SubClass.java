package com.tom.se.crazyit.chapter05.chapter57;

/**
 * @descriptions: BaseClass
 * @author: Tom
 * @date: 2021/1/14 下午 05:35
 * @version: 1.0
 */
public class SubClass extends BaseClass{
    public String book = "輕量級java ee企業應用實戰";
    @Override
    public void test(){
        System.out.println("子類覆蓋父類的方法");
    }
    public void sub(){
        System.out.println("子類的普通方法");
    }
    /**
     * 子類是一種特殊的父類,Java允許把一個子類對象直接賦給父類,
     * 無需任何轉換,或者稱為向上轉型,向上轉型自動完成
     * 相同類型的變量調用同一個方法時,呈現不同子類方法的行為,稱為多態
     *
     * 通過引用變量來訪問其包含的實例變量時,系統總是試圖訪問它編譯時類型所定義的成員變量
     * 而不是它在運行時所定義的成員變量
     */

    /**
     * 引用變量的強制類型轉換
     * 基本類型之間的轉換只能在數值類型之間進行
     * 這裡所說的數值類型包含整數型,字符型和浮點型.但數值類型和布爾類型之間不能轉換
     * 引用類型之間的轉換只能是具有繼承關係的兩個類型之間轉換,如果是兩個沒有任何繼承關係的類型
     * 則無法進行轉換;如果是一個父類轉換成子類,則該類型必須是子類類型(在編譯時是)
     *
     */

    public static void main(String[] args) {

        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        BaseClass poloymophicBc = new SubClass();
        System.out.println(poloymophicBc.book);
        poloymophicBc.base();
        poloymophicBc.test();
//        poloymophicBc.s

    }
}
// 類的創建分成三步:
// 1. 分配地址空間;
// 2. 類的初始化;
// 3. 指向類的地址;
//

class BaseClass{
    public int book = 6;
    public void base(){
        System.out.println("父類的普通方法.");
    }
    public void test(){
        System.out.println("父類被覆蓋的方法");
    }
}
