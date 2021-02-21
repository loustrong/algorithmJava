package com.tom.algrithm.hanshunping.day01.tom;

/**
 * @descriptions: ArrayQueue
 * @author: Tom
 * @date: 2021/2/1 下午 11:17
 * @version: 1.0
 */
public class ArrayQueue {
    public static void main(String[] args) {

    }
    private int initialCapacity;
    private int head;
    private int tail;
    private int size;
    private int maxIndex = initialCapacity - 1;
    private Object[] queue;
    private ArrayQueue() {
        this.initialCapacity = 16;
        this.head = -1;
        this.tail = -1;
        this.size = 0;
        this.queue = new Object[16];
    }
    private ArrayQueue(int capacity){
        this.initialCapacity = capacity;
        this.head = -1 ;
        this.tail = -1 ;
        this.size = capacity;
        this.queue = new Object[capacity];
    }
    public void push(Object addObject){
        if(this.tail > this.maxIndex){
            throw new Error("Too long!");
        }else {
            this.queue[this.tail++] = addObject;
        }

    }
    public Object remove(){
        this.size--;
        return this.queue[this.head];

    }
    public Object peek(){
        return this.queue[this.head];
    }
    public void clear(){
        for(int i = 0; i < this.initialCapacity; i++){
            this.queue[i] = null;
        }
    }
}
