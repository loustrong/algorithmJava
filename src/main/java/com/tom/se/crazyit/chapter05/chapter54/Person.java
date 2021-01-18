package com.tom.se.crazyit.chapter05.chapter54;

/**
 * @descriptions: Person
 * @author: Tom
 * @date: 2021/1/14 下午 02:35
 * @version: 1.0
 */
public class Person {
    /**
     * 訪問權限由小到大
     * private < default < protected < public
     * private只能在當前的類中被訪問
     * default可以被相同包下的類訪問
     * protected 可以被相同包訪問,也可以被子類訪問
     * public 是可以在全局內被訪問
     *
     */
    private String name;
    private int age;
    public void setName(String name){
        if(name.length() > 6 || name.length() < 2){
            System.out.println("您設置的人名不符合要求");
            return;
        }else{
            this.name = name;
        }
    }
    public void setAge(int age){
        if(age > 100 || age < 0){
            System.out.println("您設置的年齡不合法!");
            return;
        } else {
            this.age = age;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
