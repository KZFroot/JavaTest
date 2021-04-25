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
    }
}
