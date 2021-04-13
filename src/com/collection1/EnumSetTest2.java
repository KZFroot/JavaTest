package com.collection1;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2 {
    public static void main(String[] args) {
        Collection c=new HashSet();
        c.clear();
        c.add(Season.FALL);
        c.add(Season.SPRING);
        //复制Collection集合中的所有元素来创建EnumSet集合
        EnumSet enumSet =EnumSet.copyOf(c);
        System.out.println(enumSet);
        c.add("疯狂Java");
        c.add("轻量级JavaEE企业级应用实战");
        //下面代码出现异常 因为c集合的元素不是全部都为枚举值
        enumSet=EnumSet.copyOf(c);
    }
}
