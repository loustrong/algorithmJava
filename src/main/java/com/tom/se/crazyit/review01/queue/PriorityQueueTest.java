package com.tom.se.crazyit.review01.queue;

import java.util.PriorityQueue;

/**
 * PriorityQueueTest
 *
 * @author Tom on 2021/2/22
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
