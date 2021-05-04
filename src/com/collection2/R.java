package com.collection2;

public class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    //根据count来判断两个对象是否相等
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj != null && obj.getClass() == R.class) {
            R r = (R) obj;
            return r.count == this.count;
        }
        return false;
    }
//
//    //根据count来判断两个对象的大小
//    public int compareTO(Object obj) {
//        R r = (R) obj;
//        return count > r.count ? 1 : count < r.count ? -1 : 0;
//    }

    //根据count来判断两个对象的大小
    @Override
    public int compareTo(Object o) {
        R r = (R) o;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}