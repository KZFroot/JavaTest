package com.collection1;

import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrorTest {
    //自然排序 TreeSet会调用集合元素的compareTo()方法来比较元素的大小关系 然后将集合元素按升序排列
    //希望TreeSet能正常运行 TreeSet只能添加同一种类型的对象
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        //向TreeSet集合添加两个对象Err对象
        ts.add(new String("疯狂Java讲义"));
        ts.add(new Date());
    }
}
