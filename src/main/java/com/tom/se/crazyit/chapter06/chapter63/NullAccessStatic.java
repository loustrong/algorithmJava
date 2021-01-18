package com.tom.se.crazyit.chapter06.chapter63;

/**
 * @descriptions: NullAccessStatic
 * @author: Tom
 * @date: 2021/1/16 上午 12:37
 * @version: 1.0
 *
 * Java類裡面只能包含成員變量,方法,構造器,初始化塊
 * 和內部類(包括接口,枚舉)
 * 使用static修飾的成員就是類變量,構造函數不能使用static修飾
 * 類變量屬於整個類,當系統第一次準備使用該類時,系統會為
 * 該類變量分配內存空間,類變量開始生效,直到該類被卸載
 * 該類的類變量所佔有的內存才被垃圾回收系統回收
 * 類變量生存時間幾乎等同於該類的生存範圍
 */
public class NullAccessStatic {
    public static void test(){
        System.out.println("static修飾的類方法");
    }
    public static void main(String[] args) {
        NullAccessStatic nas = null;
        nas.test();
    }
}
