package com.oriented;

public class Recursive {
    //递归方法 一个方法内调用它自身，称为递归方法，方法递归包含了一种隐式循环，它会重复执行某段代码，但这种执行必须无循环控制
    //f(0)=1  f(1)=4 f(n+2)=2*f(n+1)+fn
   public static int fn(int n){
       if (n==0){
           return 1;
       }else if (n==1){
           return 4;
       }else {
           //方法中调用自身，就是递归方法
           return 2*fn(n-1)+fn(n-2);
       }
    }

    public static void main(String[] args) {
        //输出f(10)的值
        System.out.println(fn(10));
    }
}
