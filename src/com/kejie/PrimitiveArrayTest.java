package com.kejie;

public class PrimitiveArrayTest {
    public static void main(String[] args) {
        //基本类型数组初始化  定义一个int[]类型的数值变量
        int [] iArr;
        //动态初始化数组，长度为5
        iArr=new int[5];
        //采用循环给每个数组赋值
        for (int i=0;i<iArr.length;i++){
            iArr[i]=i+10;
            System.out.println(iArr[i]);
        }
    }

}
