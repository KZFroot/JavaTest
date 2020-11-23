package com.kejie;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Arrays {
    //Java提供的Arrays类里包含的一些static修饰的方法可以直接操作数组
    public static void main(String[] args) {
        //定义一个a数组
        int[] a = new int[]{3, 4, 5, 6};
        //定义一个a2数组
        int[] a2 = new int[]{3, 4, 5, 6};
        //a数组和a2数组的长度相等，每个元素依次相等，将输出true
        System.out.println("a数组和a2数组是否相等：" + java.util.Arrays.equals(a, a2));
        //通过复制a数组，生产一个新的b数组
        int[] b = java.util.Arrays.copyOf(a, 6);
        System.out.println("a数组和b数组是否相等：" + java.util.Arrays.equals(a, b));
        System.out.println("b数组的数组元素：" + java.util.Arrays.toString(b));
        //将b数组的第3个元素(包括)到第5个元素（不包括）赋值为1
        java.util.Arrays.fill(b, 0, 3, 1);
        System.out.println("b数组的元素为：" + java.util.Arrays.toString(b));
        //数组排序
        java.util.Arrays.sort(b);
        System.out.println("b数组排序输出" + java.util.Arrays.toString(b));
        //数组排序
        int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};
        //对数组arr1进行并发排序
        java.util.Arrays.parallelSort(arr1);
        System.out.println(java.util.Arrays.toString(arr1));
        int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
        java.util.Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            //left 代表数组中的前一个索引处的元素,计算第一个元素 left为1
            //right 代表数组中当前索引处的元素
            @Override
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });
        System.out.println(java.util.Arrays.toString(arr2));
        int [] arr3 =new int[5];
        java.util.Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            //operand 代表正在计算的元素索引
            @Override
            public int applyAsInt(int operand) {
                return operand * 5;
            }
        });
        System.out.println(java.util.Arrays.toString(arr3));
    }
}
