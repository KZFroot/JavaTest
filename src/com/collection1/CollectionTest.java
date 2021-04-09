package com.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    //Collection接口是List Set和Queue接口的父接口 该接口里定义的方法可用于操作Set集合,也可用于List和Queue集合
    public static void main(String[] args) {
        Collection c=new ArrayList();
        //添加元素
        c.add("孙悟空");
        //虽然集合里不能放基本类型的值 但JAVA支持自动封装
        c.add(6);
        System.out.println("c集合的元素个数为："+c.size());
        //删除指定元素
        c.remove(6);
        System.out.println("c集合的元素个数为："+c.size());
        //判断是否包含指定字符串
        System.out.println("c集合是否包含\"孙悟空\"字符串："+c.contains("孙悟空"));
        c.add("轻量级JavaEE企业应用实战");
        System.out.println("c集合的元素："+c);
        Collection books=new HashSet();
        books.add("轻量级JavaEE企业应用实战");
        books.add("疯狂Java讲义");
        System.out.println("books集合"+books);
        System.out.println("c集合是否完全包括books集合？"+c.containsAll(books));
        //用c集合减去books集合里的元素
        c.removeAll(books);
        System.out.println("c集合的元素："+c);
        //控制books集合里只剩下c集合里包含的元素
        books.retainAll(c);
        System.out.println("books集合的元素："+books);
    }

}
