package com.tom.se.extends1;

/**
 * @descriptions: My Stack
 * @author: Tom
 * @date: 2020/12/15 下午 08:00
 * @version: 1.0
 */
public class MyStack {
    private java.util.ArrayList list = new java.util.ArrayList();

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(getSize() -1);
    }
    public Object pop(){
        Object o = list.get(getSize() -1);
        list.remove(getSize() -1);
        return o;
    }
    public void push(Object o){
        list.add(o);
    }
    public int search(Object o){
        return list.lastIndexOf(o);
    }
    @Override
    public String toString(){
        return "stack:" + list.toString();
    }
}
