package com.collection1;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List books=new ArrayList();
        //向books集合中添加三个元素
        books.add(new String("轻量级JavaEE企业应用实践"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        System.out.println(books);
       books.add(1,new String("疯狂的Ajax讲义"));
       for (int i=0;i<books.size();i++){
           System.out.println(books.get(i));
       }
       //删除第三元素
        books.remove(2);
        System.out.println(books);
        //判断指定元素在List集合中得位置,输出1,表明位于第二位
        System.out.println(books.indexOf(new String("疯狂Ajax讲义")));
        //将第二个元素替换新的元素
        books.set(1,new String("疯狂Java讲义"));
        System.out.println(books);
        //将books集合的第二元素(包括)到第三个(不包括)截取成子集合
        System.out.println(books.subList(1,2));
    }
}
