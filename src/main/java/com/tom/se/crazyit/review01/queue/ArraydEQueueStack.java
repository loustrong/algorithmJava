package com.tom.se.crazyit.review01.queue;

import java.util.ArrayDeque;

/**
 * ArrayDequeueStack
 *
 * @author Tom on 2021/2/22
 */
public class ArraydEQueueStack {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        stack.push("疯狂Java讲义");
        stack.push("轻量级Java EE企业应用实战");
        stack.push("疯狂Android讲义");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        ArrayDeque queue = new ArrayDeque();
        queue.offer("疯狂Java讲义");
        queue.offer("轻量级Java EE企业应用实战");
        queue.offer("疯狂Android讲义");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        // ArrayQueue作为队列的行为
        ArrayDeque queueList = new ArrayDeque();
        queueList.offer("疯狂Java讲义");
        queueList.offer("轻量级Java EE企业应用实战");
        queueList.offer("疯狂Android讲义");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
