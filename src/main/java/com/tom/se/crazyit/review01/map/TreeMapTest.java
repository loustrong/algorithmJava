package com.tom.se.crazyit.review01.map;

import java.util.TreeMap;

/**
 * @descriptions: TreeMapTest
 * @author: Tom
 * @date: 2021/2/23 上午 11:52
 * @version: 1.0
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put(new R(3),"輕量級Java EE企業應用實戰");
        tm.put(new R(-5), "瘋狂Java講義");
        tm.put(new R(9), "瘋狂Android講義");
        System.out.println("TreeMap");
        System.out.println(tm);
        System.out.println("TreeMap lastKey");
        System.out.println(tm.lastKey());
        System.out.println("TreeMap firstEntry");
        System.out.println(tm.firstEntry());
        System.out.println("TreeMap 高於2");
        System.out.println(tm.higherKey(new R(2)));
        System.out.println("TreeMap 低於2");
        System.out.println(tm.lowerKey(new R(2)));
        System.out.println("TreeMap -1 和 4之間");
        System.out.println(tm.subMap(new R(-1), new R(4)));

    }
}

class R implements Comparable{
    int count;
    public R(int count){
        this.count = count;
    }

    @Override
    public String toString(){
        return "R[count:" + count + "]";
    }

    @Override
    public boolean equals(Object obj){
      if(this == obj){
         return true;
      }
      if(obj !=null && obj.getClass() == R.class){
          R r = (R) obj;
          return r.count == this.count;
      }
      return false;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R) o;
        return count > r.count ? 1 : count < r.count? -1: 0;
    }
}