package com.collection2;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    //泛型(Generic)
    public static void main(String[] args) {
        //创建一个只想保存字符串的List集合
        List<String> strList = new ArrayList<String>();
        strList.add("疯狂的Java讲义");
        strList.add("疯狂的Android讲义");
        //下面代码将引起编译错误
        //List.add(5);
        strList.forEach(str-> System.out.println(str.length()));
    }
}
