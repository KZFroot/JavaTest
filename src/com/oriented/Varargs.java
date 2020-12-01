package com.oriented;

public class Varargs {
    //形参个数可变的方法
    //从jdk1.5之后，java允许定义形参个数可变的参数，在最后一个形参类型后增加（...）,则表明该形参可以接受多个参数值，多个参数值被当做数组传入
    //D定义形参可变方法
    public static void test(int a, String... books) {
        //books被当做数组处理
        for (String temp : books) {
            System.out.println(temp);
        }
        //输出变量a的值
        System.out.println(a);
    }

    public static void main(String[] args) {
        //调用test方法
        //长度可变的形参只能处于形参列表的最后  一个方法中最多只能包含一个长度可变的形参，长度可变的形参本质就是一个数组类型的形参，可以传入多个参数，也可以传入数组
        test(5,"你是傻逼吗","是的,你是");
    }
}
