package com.collection1;

import java.util.Objects;

public class Z implements Comparable {
    //对于TreeSet集合而言 它判断两个对象是否相等的唯一标准是：两个对象通过compareTo(Object obj)
    // 方法比较返回是否是0 如果通过compareTo比较返回的是0则认为他们相等 否则不相符
    int age;

    public Z(int age) {
        this.age = age;
    }
    //重写equals()方法 总是返回true

    @Override
    public boolean equals(Object obj) {
        return true;
    }


    @Override
    public int compareTo(Object o) {
        return 1;
    }
}

