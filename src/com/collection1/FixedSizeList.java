package com.collection1;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args) {
        //Arrays,该方法可以把一个数组或指定个数的对象转换为List集合
        List<String> fixedList = Arrays.asList("疯狂Java讲义", "轻量级JavaEE企业应用实战");
        //获取fixedList的实现类
        System.out.println(fixedList.getClass());
        //使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);
        //试图添加 删除元素都会引发UnsupportedOperationException异常
        fixedList.add("疯狂Android讲义");
        fixedList.remove("疯狂Java讲义");
    }
}
