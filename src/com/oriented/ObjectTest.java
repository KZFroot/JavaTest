package com.oriented;

import java.util.Objects;

public class ObjectTest {
    //定义一个obj变量 它的默认值是null
    static ObjectTest obj;
    public static void main(String[] args) {
       //输入一个null对象的hashCode值 输出0
        System.out.println(Objects.hashCode(obj));
        //输入一个null对象的toString,输出null
        System.out.println(Objects.toString(obj));
    }
}
