package com.tom.se.crazyit.chapter06.chapter64;

import java.util.Objects;

/**
 * @descriptions: CacheImmutable
 * @author: Tom
 * @date: 2021/1/16 下午 04:27
 * @version: 1.0
 */
public class CacheImmutableTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        CacheImmutable c1 = CacheImmutable.valueOf(str1);
        CacheImmutable c2 = CacheImmutable.valueOf(str1);
        CacheImmutable c22 = CacheImmutable.valueOf(str1);

        System.out.println(c1==c2);
        System.out.println(c22==c2);
        System.out.println(c22==c1);
        CacheImmutable c3 = new CacheImmutable("World");
        CacheImmutable c4 = new CacheImmutable("World");
        System.out.println(c3 ==c4 );
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


    }

}

class CacheImmutable {

    private static int MAX_SIZE = 10;
    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];
    // 記錄緩存中的位置, cache[pos-1]為最新緩存的實例

    private static int pos = 0;
    private final String name;

    public CacheImmutable(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static CacheImmutable valueOf(String name) {

        for (int i = 0; i < MAX_SIZE; i++) {
            if (cache[i] != null && cache[i].getName().equals(name)) {
//                System.out.println(true);
                return cache[i];
            }
            // 如果緩存吃已經滿了
            if (pos == MAX_SIZE) {
                cache[0] = new CacheImmutable(name);
                pos = 1;
            } else {
                cache[pos++] = new CacheImmutable(name);
            }
        }
        return cache[pos - 1];
    }

    @Override
    public boolean equals(Object o) {
       if(this == o){ return true; }
       if(o != null && o.getClass() == CacheImmutable.class){
           CacheImmutable c1 = (CacheImmutable) o;
           return name.equals(c1.getName());
       }
       return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
