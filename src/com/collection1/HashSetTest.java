package com.collection1;

import java.util.HashSet;

public class HashSetTest {
    //HashSet具有以下特点 1 不能保证元素的排列顺序 顺序也有可能发生变化
    //2 HashSet不是同步的 如果多个线程同时访问一个HashSet 必须通过代码保证其同步 3集合元素值可以是null
    //当向HashSet集合存入一个元素时 HashSet会调用该对象的HashCode()方法来得到该对象的HashCode值，然后根据HashCode值决定该对象在HashSet中存储位置。
    //如果两个元素通过equals()方法比较返回true 但它们的HashCode()方法返回值不相等 HashSet将会把它们存储在不同位置 依然可以添加成功
    //也就是说 HashSet集合判断两个元素相等的标准是两个对象通过equals()方法比较相等 并且两个对象的hashCode()方法返回值相等
    public static void main(String[] args) {
        HashSet books=new HashSet();
        //分别向books集合中添加两个A对象 两个B对象 两个C对象
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
        //HashCode()方法的基本原则 1在程序运行的过程中 同一个对象多次调用hashCode()方法应该返回相同的值
        //当两个对象通过equals()方法比较返回true时 两个对象的hashCode()方法应返回相等的值
        //对象中用作equals()方法比较标准的实例变量 都应该用于计算hashCode值
    }
}
