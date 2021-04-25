package com.collection1;
import java.util.ArrayDeque;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        //ArrayDeque不仅可以作为栈使用 也可以作为队列使用
        ArrayDeque queue=new ArrayDeque();
        //依次将三个元素加入队列
        queue.offer("疯狂Java讲义");
        queue.offer("轻量级JavaEE企业应用实践");
        queue.offer("疯狂的Android");
        System.out.println(queue);
        //访问队列头部的元素 但并不将其poll出队列
        System.out.println(queue.peek());
        System.out.println(queue);
        //poll出第一个元素
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

