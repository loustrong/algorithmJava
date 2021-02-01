package com.tom.se.crazyit.chapter08.chapter84;

import java.util.ArrayList;
import java.util.List;

/**
 * @descriptions: ListTest
 * @author: Tom
 * @date: 2021/1/19 下午 09:49
 * @version: 1.0
 *
 * ArrayList的性能比LinkedList的性能要好,因此大部分時候使用ArrayList
 * 如果需要遍歷List集合元素,對於ArrayList,Vector集合,應該使用隨機訪問方法(get)
 * 來遍歷集合元素.
 * 如果需要經常執行插入,刪除操作來改變大量數據的List集合的大小,可考慮使用LinkedList集合.
 * 使用ArrayList,Vector集合可能需要經常重新分配內部數組的大小,效果可能較差
 * 如果有多個線程需要同時訪問List集合中的元素,考慮使用Collections將集合包裝成線程安全的集合
 */
public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("輕量級JavaEE企業應用實戰"));
        books.add(new String("瘋狂Java講義"));
        books.add(new String("瘋狂Android講義"));
        System.out.println(books);
        books.add(1, new String("瘋狂Ajax講義"));
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("瘋狂Ajax講義")));
        books.set(1, new String("瘋狂Java講義"));
        System.out.println(books);
        System.out.println(books.subList(1,2));

    }
}
