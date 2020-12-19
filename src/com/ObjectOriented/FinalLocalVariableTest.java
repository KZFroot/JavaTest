package com.ObjectOriented;

import java.util.Arrays;

public class FinalLocalVariableTest {
    public void test(final int a) {
        //不能对final修饰的形参赋值 下面语句非法
        //a=5;
    }

    public static void main(String[] args) {
        //定义final局部变量时指定默认值 则str变量无法重新赋值
        final String str = "hello";
        //下面赋值语句非法
        //str="111";
        //定义final局部变量时没有指定默认值，则d变量可被赋值一次
        final double d;
        d = 5;
        //对final重复赋值，下面非法语句
        //d=3.4;

        //当使用final修饰基本变量时,不能对基本变量重新赋值，因此基本变量不能被改变
        // 但对于引用类型变量而言 它保存的仅仅是一个引用 final只保证这个引用类型变量所引用的地址不会变
        // 即一直引用同一个对象  但这个对象完全可以发送改变
        //final修饰数组变量 iArr是一个引用变量
        final int[] iArr={5,6,12,9};
        System.out.println(iArr);
        //对数组进行排序，合法
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        //对数组元素赋值 合法
        iArr[2]=-8;
        System.out.println(Arrays.toString(iArr));
        //下面语句对iArr重新赋值，非法
        //iArr=null;
    }
}
