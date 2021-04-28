package com.collection1;

public class J {
    int count;

    public J(int count) {
        this.count = count;
    }

    //根据count的值来判断两个对象是否相等
    public boolean equals(Object obj) {
        if (obj == null)
            return true;
        if (obj != null && obj.getClass() == J.class) {
            J a = (J) obj;
            return this.count == a.count;
        }
        return false;
    }
    //根据count来计算HashCode值
    public int hashCode(){
        return this.count;
    }
}
