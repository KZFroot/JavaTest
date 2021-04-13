package com.collection1;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    //HashSet还要一个子类LinkedHashSet,LinkHashSet集合也是根据元素的hashCode值来决定元素的存储位置，但他同时使用链表维护元素的次序，
    // 这样使得元素看起来以插入的顺序保存的 当遍历LinkedHashSet集合里的元素时,LinkedHashSet将会按元素添加顺序来访问集合里的元素
    //LinkedHashSet需要维护元素的插入顺序 因此性能略低于HashSet的性能 但在迭代访问Set里的全部元素时将有很好的性能 因为他以链表来维护内部顺序
    public static void main(String[] args) {
        LinkedHashSet books=new LinkedHashSet();
        books.add("疯狂Java讲义");
        books.add("轻量级JavaEE企业级应用实战");
        System.out.println(books);
        //删除 疯狂Java讲义
        books.remove("疯狂Java讲义");
        //重新添加 疯狂Java讲义
        books.add("疯狂Java讲义");
        System.out.println(books);
    }
    //虽然LinkedHashSet使用链表记录集合元素的添加顺序 但LinkedHashSet依然是HashSet,因此依然不允许集合元素的重复
}
