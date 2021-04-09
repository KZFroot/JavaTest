package com.collection1;

public class A {
    //类A的equals()方法总是返回true 但是没有重写hashCode()方法
    public boolean equals(Object obj){
        return true;
    }
}
