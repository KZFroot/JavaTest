package com.collection1;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque stack=new ArrayDeque();
        //依次将三个元素push入”栈“
        stack.push("疯狂Java讲义");
        stack.push("轻量级JavaEE企业应用实践");
        stack.push("疯狂的Android");
        System.out.println(stack);
        //访问第一个元素 但并不将其pop"栈"
        System.out.println(stack.peek());
        //依然输出
        System.out.println(stack);
        //pop出第一个元素
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
