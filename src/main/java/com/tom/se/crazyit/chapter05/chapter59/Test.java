package com.tom.se.crazyit.chapter05.chapter59;

/**
 * @descriptions: Test
 * @author: Tom
 * @date: 2021/1/15 下午 03:02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}

class Root{
    static{
        System.out.println("Root的靜態初始化塊");
    }
    {
        System.out.println("Root的普通初始化塊");
    }
    public Root(){
        System.out.println("Root的無參構造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("Mid靜態初始化類");
    }
    {
        System.out.println("Mid的普通初始化類");
    }
    public Mid(){
        System.out.println("Mid的無參構造器");
    }
    public Mid(String msg){
        // 通過this調用同一個類中重載的構造器
        this();
        System.out.println("Mid的帶參數構造器,其參數值:" + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("Leaf的靜態內部類");
    }
    {
        System.out.println("Leaf的普通初始化塊");
    }
    public Leaf(){
        super("瘋狂java講義");
        System.out.println("執行Leaf構造器");
    }
}