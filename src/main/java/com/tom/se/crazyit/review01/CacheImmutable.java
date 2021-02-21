package com.tom.se.crazyit.review01;

/**
 * CacheImmutable
 *
 * @author Tom on 2021/2/21
 */
public class CacheImmutable {
    private static int MAX_SIZE = 10;
    // 使用数组来缓存已有的实例
    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];
    // 记录缓存实例在缓存中的位置，cache[pos-1]是最新缓存的实例
    private static int pos = 0;
    private final String name;
    private CacheImmutable(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static CacheImmutable valueOf(String name){
        for (int i = 0; i < MAX_SIZE; i++) {
            if(cache[i] != null && cache[i].getName().equals(name)){
                return cache[i];
            }
        }
        if(pos == MAX_SIZE){
            cache[0] = new CacheImmutable(name);
            pos = 1;
        } else {
            cache[pos++] = new CacheImmutable(name);
        }
        return cache[pos - 1];
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj != null && obj.getClass() == CacheImmutable.class){
            CacheImmutable ci = (CacheImmutable) obj;
            return name.equals(ci.getName());
        }
        return false;
    }
    public int hashCode(){
        return name.hashCode();
    }

}
