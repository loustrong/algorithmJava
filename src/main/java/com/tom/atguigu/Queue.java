package com.tom.atguigu;

/**
 * @descriptions: Queue
 * @author: Tom
 * @date: 2021/2/18 下午 08:00
 * @version: 1.0
 */
public class Queue {
    private Object[] queue;
    private int size;
    private int head;
    private int tail;
    public static int MAX_CAPACITY = 1 << 30;
    private int capacity;
    private int maxIndex;
    Queue(){
        this.capacity = 31;
        this.head = -1;
        this.tail = -1;
        this.size = 0;
        this.maxIndex = 30;
        this.queue = new Object[31];
    }
    Queue(int capacity){
        if(capacity > MAX_CAPACITY){
            throw new Error("queue size is too large!");
        }
        if(capacity < 0){
          throw new Error("queue size cannot smaller than 0!");
        }
        this.capacity = capacity;
        this.size = 0;
        this.head = -1;
        this.tail = -1;
        this.maxIndex = MAX_CAPACITY - 1;
        this.queue = new Object[MAX_CAPACITY];
    }
    public int size(){
        return this.size;
    }
    public void empty(){
        for (int i = 0; i < this.capacity; i++) {
            this.queue[i] = null;
        }
    }
}
