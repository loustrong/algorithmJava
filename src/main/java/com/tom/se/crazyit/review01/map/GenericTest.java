package com.tom.se.crazyit.review01.map;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @descriptions: GenericTest
 * @author: Tom
 * @date: 2021/2/23 下午 06:18
 * @version: 1.0
 */
public class GenericTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        List arrayList = new ArrayList();
        arrayList.add("aaaaa");
        arrayList.add(1000);
//        for (int i = 0; i < arrayList.size(); i++) {
//            String item = (String) arrayList.get(i);
//            System.out.println("泛型测试" +"item = " + item);
//
//        }
        List<String> stringList = new ArrayList<String>();
        List<Integer> integerList = new ArrayList<Integer>();
        System.out.println(stringList.getClass() == integerList.getClass());


        Generic<Integer> genericInteger = new Generic<Integer>(1234);
        Generic<String> genericString = new Generic<String>("12345");
        showKeyValue1(genericInteger);
        genericInteger.genericMethod(Class.forName("com.test.test"));

        List<?>[] lsa = new ArrayList[10]; // OK, array of unbounded wildcard type.
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li; // Correct.
        Integer i = (Integer) lsa[1].get(0); // OK
    }

    public static void showKeyValue1(Generic<?> obj){
        System.out.println("泛型測試:" + "key value is " + obj.getKey());
    }
}

class Generic<T>{
    private T key;
    public Generic(T key){
        this.key = key;
    }
    public T getKey(){
        return this.key;
    }

    /**
     *
     * @param tClass
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     * 1. public 與返回值中間的<T>很重要,可以理解為聲明此方法為泛型方法
     * 2. 只有聲明了<T>的方法為泛型方法,泛型類中的使用了泛型的成員方法並不是泛型方法
     * 3.<T> 表明該方法將使用泛型類型T,此時才可以在方法中使用泛型方法
     * 4. 此處T可以是任意標示
     */
    public <T> T genericMethod(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T instance = tClass.newInstance();
        return instance;
    }
    public void show_1(T t){
        System.out.println(t.toString());
    }

    //在泛型类中声明了一个泛型方法，使用泛型E，这种泛型E可以为任意类型。可以类型与T相同，也可以不同。
    //由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
    public <E> void show_3(E t){
        System.out.println(t.toString());
    }

    //在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
    public <T> void show_2(T t){
        System.out.println(t.toString());
    }
    public static <T> void show(T t){

    }
}
interface Generator<T>{
    public T next();
}
class FruitGenerator<T> implements Generator<T>{
    @Override
    public T next(){
        return null;
    }
}

class VegetableGenerator implements Generator<String>{
    @Override
    public String next(){
        return null;
    }
}
