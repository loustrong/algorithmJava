package com.tom.se.crazyit.chapter05.chapter59;

import com.tom.se.crazyit.chapter05.chapter51.Person;

/**
 * @descriptions: PersonInitial
 * @author: Tom
 * @date: 2021/1/15 下午 02:28
 * @version: 1.0
 *
 * Java類裡面的成員為: 成員變量, 方法和構造器以及初始化塊
 *
 */
public class PersonInialize {
    {
        int a = 6;
        if( a > 4){
            System.out.println("Person初始化塊:局部變量的值大於4");
        }
        System.out.println("Perosn的初始化塊");
    }
    {
        System.out.println("第二個初始化塊");
    }
    public PersonInialize(){
        System.out.println("Person類裡面的無參構造器");
    }

    public static void main(String[] args) {
        new PersonInialize();
    }
}
