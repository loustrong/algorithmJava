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
        this.maxIndex = capacity - 1;
        this.queue = new Object[capacity];
    }
    public int size(){
        return this.size;
    }
    public void empty(){
        for (int i = 0; i < this.capacity; i++) {
            this.queue[i] = null;
        }
    }

    public void offer(Object o){
        if(this.size > this.capacity){
            System.out.println("the queue is full.");
            return ;
        }
        if(++this.tail  > this.maxIndex){
            this.tail = 0;
        }
        this.queue[this.tail] = o;
        this.size ++;
    }

    public Object poll(){
        if(this.size <= 0){
            System.out.println("The number of the queue is 0.");
            return null;
        }
        System.out.println("before this.head:" + this.head);
        if(++this.head  > this.maxIndex){
            this.head = 0;
        }
        System.out.println("this.head:" + this.head);
        Object o = this.queue[this.head];
        this.queue[this.head] = null;

        this.size --;
        return o;
    }
    public Object peek(){
        return this.queue[this.head];
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    @Override
    public String toString(){
        if(this.size <= 0 ){ return "{}"; }
        int h = this.head;
        int count = 0;

        StringBuilder builder = new StringBuilder(this.size + 8);
        builder.append("{");
        while(count < this.size){
            if(++h > this.maxIndex){ h = 0;}
            builder.append(this.queue[h] + ",");

            count++;
        }
        return builder.substring(0, builder.length() -1) +  "}";
    }


    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.offer(new Integer(1));
        queue.offer(new Integer(2));
        queue.offer(new Integer(3));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.offer(new Integer(4));
        queue.offer(new Integer(5));
        queue.offer(new Integer(6));
        queue.offer(new Integer(7));
        queue.offer(new Integer(8));
        queue.offer(new Integer(9));
        queue.offer(new Integer(10));
        queue.offer(new Integer(11));
        queue.offer(new Integer(12));
        System.out.println(queue);

    }







}
