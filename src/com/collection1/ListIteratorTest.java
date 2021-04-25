package com.collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books={
                "疯狂Java讲义","疯狂iOS讲义",
                "轻量级JavaEE企业应用实践"
        };
        List booksList =new ArrayList();
        for (int i=0; i<books.length;i++){
            booksList.add(books[i]);
        }
        ListIterator lit=booksList.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
            lit.add("-----分隔符------");
        }
        System.out.println("======下面开始反向迭代======");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
