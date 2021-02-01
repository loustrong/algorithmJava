package com.tom.se.crazyit.chapter08.chapter83;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * @descriptions: PredicateTest
 * @author: Tom
 * @date: 2021/1/19 下午 07:39
 * @version: 1.0
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("輕量級Java EE企業應用實戰"));
        books.add(new String("瘋狂Java講義"));
        books.add(new String("瘋狂iSO講義"));
        books.add(new String("瘋狂Ajax講義"));
        books.add(new String("瘋狂Android講義"));
        // 使用lambda表達式(目標類型是Predicate)過濾集合
        // books.removeIf(ele ->((String)ele).length() < 10);
        // System.out.println(books);
        System.out.println(callAll(books,ele -> ((String)ele).contains("瘋狂")));
        System.out.println(callAll(books,ele -> ((String)ele).contains("Java")));
        System.out.println(callAll(books,ele -> ((String)ele).length() >10));

    }
    public static int callAll(Collection books, Predicate p){

        int total = 0;
        for(Object obj: books){
            if(p.test(obj)){
                total ++;
            }
        }
        return total;
    }
}
