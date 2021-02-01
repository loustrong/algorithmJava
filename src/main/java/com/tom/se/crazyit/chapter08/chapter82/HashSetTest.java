package com.tom.se.crazyit.chapter08.chapter82;

import java.sql.SQLOutput;
import java.util.HashSet;

/**
 * @descriptions: HashSetTest
 * @author: Tom
 * @date: 2021/1/19 下午 07:51
 * @version: 1.0
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
class A{
    @Override
    public boolean equals(Object obj){
        return true;
    }
}
class B{
    @Override
    public int hashCode(){
        return 1;
    }
}
class C{
    @Override
    public int hashCode(){
        return 2;
    }
    @Override
    public boolean equals(Object obj){
        return true;
    }
}
