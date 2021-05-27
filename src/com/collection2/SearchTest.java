package com.collection2;

import com.collection1.C;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest {
    public static void main(String[] args) {
        ArrayList nums=new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        //输出最大元素 将输出3
        System.out.println(Collections.max(nums));
        //输出最小元素
        System.out.println(Collections.min(nums));
        //将nums中的0用1代替
        Collections.replaceAll(nums,0,1);
        System.out.println(nums);
        //判断-5在集合中出现的次数
        System.out.println(Collections.frequency(nums,-5));
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println(Collections.binarySearch(nums,3));
    }
}

