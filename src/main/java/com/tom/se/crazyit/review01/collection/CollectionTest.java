package com.tom.se.crazyit.review01.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @descriptions: CollectionTest
 * @author: Tom
 * @date: 2021/2/22 下午 03:12
 * @version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孫悟空");
        c.add(6);
        System.out.println("c集合的元素的個數為:" + c.size());
        c.contains("孫悟空");
        System.out.println("c.contains(\"孫悟空\")" + c.contains("孫悟空"));
        c.remove(6);
        c.add("瘋狂Java EE企業應用實戰");
        System.out.println("c集合的元素:" + c);
        Collection books = new HashSet();
        books.add("輕量級Java EE實戰");
        books.add("瘋狂Java講義");
        System.out.println("c集合是否完全包含books集合?" + c.contains(books));
        c.removeAll(books);
        System.out.println("c集合的元素:"+ c);
        // 刪除c集合里的所有元素
        c.clear();
        c.add("瘋狂Java講義");
        System.out.println("c集合的元素:" + c);
        books.retainAll(c);
        System.out.println("books集合的元素:" + books);
        books.forEach(res -> System.out.println("書籍是:" + res));
        Iterator it = books.iterator();
        it.forEachRemaining(obj -> System.out.println("迭代集合元素:" + obj));
        while(it.hasNext()){
            String book = (String) it.next();
            System.out.println(book);
            if(book.equals("瘋狂Java講義")){
                it.remove();
            }
            book = "測試字符串";
        }
        System.out.println(books);
        books.add(new String("輕量級Java EE企業應用實戰"));
        books.add(new String("瘋狂Java講義"));
        books.add(new String("瘋狂iOS講義"));
        books.add(new String("瘋狂Ajax講義"));
        books.add(new String("瘋狂Android講義"));
        System.out.println(callAll(books,ele ->((String)ele).contains("瘋狂")));
        System.out.println(callAll(books,ele ->((String)ele).contains("Java")));
        System.out.println(callAll(books,ele ->((String)ele).length() > 10));
        books.removeIf(ele -> ((String) ele).length() < 10);
        for(Object obj: books){
            String book = (String) obj;
            System.out.println(book);
        }
    }

    public static int callAll(Collection books, Predicate p){
        int total = 0;
        for(Object obj: books){
            if(p.test(obj)){
                total++;
            }
        }
        return total;
    }

}
