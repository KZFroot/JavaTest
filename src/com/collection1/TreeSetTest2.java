package com.collection1;

import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        Z z1 = new Z(6);
        set.add(z1);
        //第二次添加同一个对象，输出true表面添加成功
        System.out.println(set.add(z1));
        //下面输出set集合，将看到有两个元素
        System.out.println(set);
        //修改set集合的第一个元素的age变量
        ((Z)(set.first())).age=9;
        //输出set集合的最后一个元素的age变量，将看到也变成9
        System.out.println(((Z)(set.last())).age);
    }
}
