package com.tom.se.crazyit.chapter05.chapter59;

/**
 * @descriptions: InstanceInitTest
 * @author: Tom
 * @date: 2021/1/15 下午 02:33
 * @version: 1.0
 *
 * 當Java創建一個對象時,系統先為該對象所有的實例變量分配內存(前提是該類已經加載過了),
 * 接著程序開始對這些實例變量進行初始化,其初始化的順序是:
 * 1. 先執行初始化塊或聲明實例變量時指定的初始值(這兩個地方指定初始值的執行允許
 * 與它們在源代碼中的排列順序相同),
 * 2. 再執行構造器裡面的初始值
 * 在使用javac指令編譯Java類后,初始化塊中的代碼會被還原到每個構造器中,
 * 且位於構造器所有代碼的前面
 *
 */
public class InstanceInitTest {
    // 先執行初始化將a實例變量賦值為6
    {
        a = 6;
    }
    // 再執行賦值為9
    int a = 9;

    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
    }
}
