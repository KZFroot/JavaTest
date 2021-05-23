package com.collection2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        ArrayList nums=new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);// 输出：[2,-5,3,0]
        Collections.reverse(nums);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.shuffle(nums);
        System.out.println(nums);
    }
}
