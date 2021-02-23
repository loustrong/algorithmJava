package com.tom.se.crazyit.review01.queue;

import java.util.LinkedList;

/**
 * LinkedListTest
 *
 * @author Tom on 2021/2/22
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        books.offer("疯狂Java讲义");
        books.push("轻量级Java EE企业应用实战");
        books.offerFirst("疯狂Android讲义");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("遍历中:" + books.get(i));
        }
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}
