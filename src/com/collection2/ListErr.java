package com.collection2;

import com.collection1.A;

import java.util.ArrayList;
import java.util.List;

public class ListErr {
    public static void main(String[] args) {
        //创建一个只想保存字符串的List集合
        List strList=new ArrayList();
        strList.add("疯狂Java讲义");
        strList.add("疯狂Android");
        //不小心把一个Integer对象丢进集合
        strList.add(5);
        strList.forEach(str-);
    }
}
