package com.kejie;

public class ArrayInRam {
    //深入数组 数组是一种引用数据类型 数组引用变量只是一个引用，数组元素和数组变量在内存里是分开存放的
    //与所有的引用变量相同的是，引用变量是访问真实对象的根本方式 在程序中访问数组对象本身，只能通过这个数组的引用变量来访问它
    //实际数组的对象被存储在堆内存中；如果引用该数组对象的数组引用变量是一个局部变量，那么他被存储在栈内存中，
    //如果堆内存中存储数组元素，则程序通过p[index]的形式实现
    public static void main(String[] args) {
        //定义并初始化数组，使用静态初始化
        int[] a={1,9,20};
        //定义并初始化数组，使用动态初始化
        int [] b=new int[4];
        //输出b数组的长度
        System.out.println("b数组的长度为："+b.length);
        //循环输出a数组的元素
        for (int i=0,len=a.length;i<a.length;i++){
            System.out.println(a[i]);
        }
        //循环输出b数组的元素
        for (int i=0,len=b.length;i<len;i++){
            System.out.println(b[i]);
        }
        //因为a是int[]类型，b也是int[]类型，所以可以将a的值赋给b
        //也就是让b引用指向a引用的数组
        b=a;
        //再次输出b数组的长度
        System.out.println("b数组的数组长度"+b.length);
    }
    //定义一个初始化数组之后，在内存中分配了两个空间，一个存放数组的引用变量，一个存放数组本身
}
