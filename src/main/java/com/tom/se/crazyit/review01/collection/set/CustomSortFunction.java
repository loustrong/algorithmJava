package com.tom.se.crazyit.review01.collection.set;

import java.util.TreeSet;

/**
 * @descriptions: Custom
 * @author: Tom
 * @date: 2021/2/22 下午 04:58
 * @version: 1.0
 */
public class CustomSortFunction {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet((o1, o2) -> {
            M m1 = (M) o1;
            M m2 = (M) o2;
            return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
        });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
        TreeSet<N> tn = new TreeSet<>();
        tn.add(new N("Hello"));
        tn.add(new N("World"));
        tn.add(new N("World!!"));
        System.out.println(tn);

    }
}

class M {
    int age;
    public M(int age){
    this.age = age;
    }
    @Override
    public String toString(){
        return "M[age:"+ age +"]";
    }
}
class N implements Comparable{
    public String name;
    public N(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if(this == o || ((N)o).name.length() == this.name.length()){
          return 0;
        }
        if(o != null && ((N)o).name.length() > this.name.length()){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "N{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o!=null && ((N) o).getName().equals(this.getName())){
            return true;
        }
        return false;

    }
}