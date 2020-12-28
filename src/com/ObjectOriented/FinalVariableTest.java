package com.ObjectOriented;


public class FinalVariableTest {
    //定义成员变量时指定默认值 合法
    final int a=6;
    //下面变量将在构造器或初始化块中分配初始值
    final String str;
    final int c;
    final static double d;
    //初始化块，可对没有指定默认值的实例变量指定初始值
    {
        //在初始化块中实例变量指定初始值
        str="hello";
    }
    //静态初始化块，可对没有指定默认值的类变量指定初始值
    static
    {
        //在静态初始化块中为类变量指定初始值
        d=5.6;
    }
    //构造器，可对既没有指定默认值 又没有在初始化块中
    //指定初始值的实例变量指定初始值
    public FinalVariableTest(){
        //如果在初始化中已经对str指定了初始值
        //那么在构造器中不能对final变量重新赋值
        c=5;
    }
    //普通方法不能为final修饰的成员变量赋值
    //不能在普通方法中为final成员变量指定初始值
    public static void main(String[] args) {
        FinalVariableTest ft=new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
    }
}
