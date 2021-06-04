package com.collection2;

import java.util.*;

public class UnmodifiableTest {
    public static void main(String[] args) {
        //创建一个空的 不可变的List对象
        List unmodifiableList = Collections.emptyList();
        //创建只有一个元素 且不可变的Set对象
        Set unmodifiableSet = Collections.singleton("疯狂的Java讲义");
        //创建一个普通的Map对象
        Map scores=new HashMap();
        scores.put("语文",80);
        scores.put("Java",82);
        //返回普通的Map对象对应的不可变版本
        Map unmodifiableMap=Collections.unmodifiableMap(scores);
        //
        unmodifiableList.add("测试元素");
    }
}
