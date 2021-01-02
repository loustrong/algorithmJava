package com.tom.athome;

/**
 * Pair Test1
 *
 * @author Tom on 2021/1/1
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lambda"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
class ArrayAlg{
    public static Pair<String> minmax(String[] a){
        if(a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for(int i = 1; i < a.length; i++){
            if(min.compareTo(a[i]) > 0) min = a[i];
            if(max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
    public static <T> T getMiddle(T... a){
        return a[a.length / 2];
    }
}
class Pair<T>{
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
