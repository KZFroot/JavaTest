package com.collection1;

import java.util.HashMap;
import java.util.HashSet;

public class NullInHashMap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        //试图将两个Key为null值的key-value对 放入HashMap中
        hm.put(null,null);
        hm.put(null,null);
        //将一个value为null值的key-value对放入HashMap中
        hm.put("a",null);
        //输出Map对象
        System.out.println(hm);
    }
}
