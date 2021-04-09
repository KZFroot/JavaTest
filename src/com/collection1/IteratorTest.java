package com.collection1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        //创建集合 添加代码元素
        Collection books=new HashSet();
        books.add("轻量级JavaEE企业应用实战");
        books.add("疯狂Java讲义");
        //获取books集合对应的迭代器
        Iterator it=books.iterator();
        while (it.hasNext()){
            //it.next()方法返回的数据类型Object类型 因此需要强制类型转换
            String book=(String) it.next();
            //System.out.println(book);
            if (book.equals("疯狂Java讲义")){
                    //从集合中删除上一次next()方法返回的元素
                it.remove();
            }
            //对book变量赋值，不会改变集合元素本身
            book="测试字符串";
        }
        System.out.println(books);
    }
}
