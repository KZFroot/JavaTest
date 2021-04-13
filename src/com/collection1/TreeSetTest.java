package com.collection1;

import java.util.TreeSet;

public class TreeSetTest {
    //TreeSet是SortedSet接口的实现类 正如SortedSet所暗示的 TreeSet可以确保集合元素处于排序状态
    //与HashSet集合相比增加访问第一个 前一个 后一个 最后一个元素的方法 并提供了三个从TreeSet中截取子TreeSet的方法
    //HashSet和TreeSet是Set的两个典型实现 HashSet的性能总是比TreeSet好 因为TreeSet需要额外的红黑树算法来维护集合元素的次序
    //当需要一个保持排序的Set时 才应该使用TreeSet 否则应该使用HashSet
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        //向TreeSet中添加四个Integer对象
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        //输出集合元素 看到集合元素已处于排序状态
        System.out.println(nums);
        //输出集合里的第一个元素
        System.out.println(nums.first());
        //输出集合里的最后一个元素
        System.out.println(nums.last());
        //返回小于4的子集，不包含4
        System.out.println(nums.headSet(4));
        //返回大于5的子集 如果Set中包含5，子集中还包含5
        System.out.println(nums.tailSet(5));
        //返回大于-3小于4的子集
        System.out.println(nums.subSet(-3, 4));
    }
}
