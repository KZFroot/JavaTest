package com.collection1;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        //List将会调用A对象的equals()方法依次与集合元素进行比较 如果该equals()方法以某个集合元素作为参数返回true,
        // List将会删除该元素-A类重写equals()方法 该方法总是返回true 所以每次List集合删除A对象时 总是删除List集合中的第一个元素
        List books=new ArrayList();
        //向books集合中添加三个元素
        books.add(new String("轻量级JavaEE企业应用实践"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        System.out.println(books);
        //删除集合中的A对象 将导致第一个元素被删除
        books.remove(new A());
        System.out.println(books);
        //删除集合中的A对象 再次删除集合中的第一个元素
        books.remove(new A());
        System.out.println(books);
    }
}
