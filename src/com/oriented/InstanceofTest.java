package com.oriented;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class InstanceofTest {
    //使用instanceof运算时需要注意；instanceof运算前面操作数的编译类型要么与和后面的类型相同，要么具有父子继承关系
    public static void main(String[] args) {
        Object hello="HELLO";
        System.out.println("字符串是否是object类的实例"+(hello instanceof Object));
        System.out.println("字符串是否是Math类的实例"+(hello instanceof Math));
    }
}
