package com.tom.se.crazyit.review01.collection.set;

import java.util.LinkedHashSet;

/**
 * @descriptions: LinkedHashSetTest
 * @author: Tom
 * @date: 2021/2/22 下午 04:42
 * @version: 1.0
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> books = new LinkedHashSet<>();
        books.add("瘋狂Java講義");
        books.add("輕量級Java EE企業應用實戰");
        System.out.println(books);
        // 刪除 瘋狂java講義
        books.remove("瘋狂Java講義");
        books.add("瘋狂Java講義");
        System.out.println(books);
    }
}
