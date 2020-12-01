package com.oriented;

import java.awt.*;

public class PrimitiveTransferTest {
    //基本数据类型传参
    public static void swap(int a,int b){
       //下面三行代码实现a b变量的值交换
        //定义一个临时变量来保存a变量的值
        int temp=a;
        //将b值赋给a
        a=b;
        //把临时变量temp的值赋给a
        b=temp;
        System.out.println("swap方法里，a的值是"+a+":b的值是："+b);
    }

    public static void main(String[] args) {
        //Java程序总数从main()方法开始执行，传入swap()是a b的副本 系统分配了main方法和swap方法两块栈区
        int a=6;
        int b=9;
        swap(a,b);
        System.out.println("交换结束后，变量a的值是："+a+":变量b的值是"+b);
    }
}
