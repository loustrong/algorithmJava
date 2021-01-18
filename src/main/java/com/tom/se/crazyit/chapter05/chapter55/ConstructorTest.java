package com.tom.se.crazyit.chapter05.chapter55;

/**
 * @descriptions: ConstructorTest
 * @author: Tom
 * @date: 2021/1/14 下午 02:57
 * @version: 1.0
 */
public class ConstructorTest {
    public String name;
    public int count;
    public ConstructorTest(String name, int count){
        this.name = name;
        this.count = count;
    }
    public static void main(String[] args){
        // 使用自定義的構造器來創建對象
        // 系統將會對該對象執行自定義的初始化
        // 構造器是創建java對象的重要途徑,通過new關鍵字
        // 構造器也確實可以返回該類的對象,但這個對象並不是完全是構造器創建的.
        // 實際上,當開始調用構造器時,系統會為該對象分配內存空間.
        // 並為這個對象執行默認初始化,這個對象就產生了.這些操作在構造器執行之前就完成了.
        // 系統已經創建了對象,但是這個對象還不能被外部訪問,只能在該構造器中通過this類引用.
        // 當構造器的執行體執行結束后,這個對象作為構造器的返回值被返回.
        // 通常還會賦給另一個引用類型的變量,從而讓外部程序可以訪問這個對象
        // 一般情況下,構造器是使用public訪問權限,但是在一些狀況下要限制創建該類的對象
        // 可以把構造器設置成其他訪問權限,例如設置成protected,主要用於被子類調用
        // 設置成private,以阻止其他類創建該類的實例
        ConstructorTest tc = new ConstructorTest("Crazy Java Guide",10);
        System.out.println(tc.count);
        System.out.println(tc.name);
    }
}
