package com.collection2;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new R(3), "轻量级JavaEE企业级应用实践");
        tm.put(new R(-5), "疯狂的Java讲义");
        tm.put(new R(9), "疯狂的Android讲义");
        System.out.println(tm);
        //返回该TreeMap的第一个Entry对象
        System.out.println(tm.firstEntry());
        //返回该TreeMap的最后一个key的值
        System.out.println(tm.lastKey());
        //返回该TreeMap的比new R(2)大的最小key值
        System.out.println(tm.higherEntry(new R(2)));
        //返回该TreeMap的比new R(2)小的最大的key-value对
        System.out.println(tm.lowerEntry(new R(2)));
        //返回该TreeMap的子TreeMap
        System.out.println(tm.subMap(new R(-1), new R(4)));
    }
}
