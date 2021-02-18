package com.tom.algrithm.hanshunping.day01.ok;

/**
 * @descriptions: MyQueue
 * @author: Tom
 * @date: 2021/2/1 下午 11:41
 * @version: 1.0
 */
public class MyQueue {
    /**
     * 隊列管道,當管道中存放的數據大於隊列長度時,將不會再offer數據,直至
     * 從隊列中poll數據后
     */
    private Object[] queue;
    private int head;
    private int tail;
    private int size;
    private final static int MAX_CAPACITY = 1 << 30;
    private int capacity;
    private int maxIndex;

    public MyQueue(int initialCapacity){
        if(initialCapacity > MAX_CAPACITY){
            throw new OutOfMemoryError("initialCapacity too large");
        }
        if(initialCapacity <= 0){
            throw new IndexOutOfBoundsException("initialCapacity must be more than zero.");
        }
        queue = new Object[initialCapacity];
        capacity = initialCapacity;
        maxIndex = initialCapacity - 1;
        head = tail = -1;
        size = 0;
    }
    public MyQueue(){
        queue = new Object[16];
        capacity = 16;
        head = tail = -1;
        size = 0;
        maxIndex = 15;
    }
    public void offer(Object object){
        if(size >= capacity){
            System.out.println("Queue's size more than or equal to array's capacity.");
            return;
        }
        if(++tail > maxIndex){
            tail = 0;
        }
        queue[tail] = object;
        size++;
    }
    public Object poll(){
        if(size <=0 ){
            System.out.println("this queue is null");
            return null;
        }
        if(++head > maxIndex){
            head = 0;
        }
        size --;
        Object old = queue[head];
        queue[head] = null;
        return old;
    }
    public Object peek(){
        return queue[head];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void clear(){
        for (int i = 0; i < queue.length; i++) {
            queue[i] = null;
        }
        tail = head = -1;
        size = 0;
    }
    @Override
    public String toString(){
        if(size <=0) return "{}";
        StringBuilder builder = new StringBuilder(size + 8);
        builder.append("{");
        int h = head;
        int count = 0;
        while (count < size){
            if(++h > maxIndex) h = 0;
            builder.append(queue[h]);
            builder.append(", ");
            count++;
        }
        return builder.substring(0, builder.length() - 2) + "}";
    }
}
