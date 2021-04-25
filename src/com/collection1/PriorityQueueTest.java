package com.collection1;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    //Queue用于模拟队列这种数据结果
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        //下面代码依次向pq中加入四个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
