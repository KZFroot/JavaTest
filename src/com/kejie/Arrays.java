package com.kejie;

public class Arrays {
    //Java提供的Arrays类里包含的一些static修饰的方法可以直接操作数组
    public static void main(String[] args) {
        //定义一个a数组
        int[] a = new int[]{3, 4, 5, 6};
        //定义一个a2数组
        int[] a2 = new int[]{3, 4, 5, 6};
        //a数组和a2数组的长度相等，每个元素依次相等，将输出true
        System.out.println("a数组和a2数组是否相等：" + java.util.Arrays.equals(a, a2));
    }
}
