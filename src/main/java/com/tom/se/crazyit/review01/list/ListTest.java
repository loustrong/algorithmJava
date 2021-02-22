package com.tom.se.crazyit.review01.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * ListTest
 *
 * @author Tom on 2021/2/22
 */
public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList<>();
        books.add(new String("轻量级Java EE企业"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        System.out.println(books);
        books.add(1, new String("疯狂Ajax讲义"));
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books.indexOf(new String("疯狂Ajax讲义")));
        // 将第二个元素替换成新的字符串对象
        books.set(1, new String("疯狂JAVA讲义"));
        System.out.println(books);
        System.out.println(books.subList(1, 2));
        books.sort((o1, o2) ->((String)o1).length()-((String)o2).length());
        books.replaceAll(ele -> ((String)ele).length());
        System.out.println(books);
        System.out.println("-----------------------------------------");
        String[] books1 = {"疯狂Java讲义", "疯狂iOS讲义","轻量级Java EE企业应用实战"};
        List bookList = new ArrayList();
        for (int i = 0; i < books1.length; i++) {
            bookList.add(books1[i]);
        }
        ListIterator lit = bookList.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
            lit.add("----------分隔符-------------");
        }
        System.out.println("下面开始反向迭代");
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        List fixedList = Arrays.asList("疯狂Java讲义","轻量级Java EE企业应用实战");
        // 获取fixedList的实现类,将输出Arrays$ArrayList
        System.out.println(fixedList.getClass());
        fixedList.forEach(System.out::println);
        fixedList.add("疯狂Android讲义");
        fixedList.remove("疯狂Java讲义");

    }
}
