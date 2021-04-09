package com.collection1;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args) {
        //创建一个集合
        Collection books=new HashSet();
        books.add("轻量级JavaEE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        //调用forEach
        books.forEach(obj-> System.out.println("迭代集合元素："+obj));
    }
}
