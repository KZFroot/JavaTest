package com.collection1;

public class PriorityQueue {
    //Queue用于模拟队列这种数据结果
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        //下面代码依次向pq中加入四个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(8);
        System.out.println(pq);
        System.out.println(pq.poll());
    }

    private void offer(int i) {
    }

    private boolean poll() {
    }
}
