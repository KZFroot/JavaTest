package com.oriented;

public class ThisInConstructor {
    //定义一个成员变量
    public int foo;
    //构造方法
    public ThisInConstructor(){
     //在构造方法里定义变量
     int foo=0;
     //使用this代表构造器正在初始化对象
    //下面的代码将会把该构造器正在=初始化的对象的foo成员变量设为6
        this.foo=6;
    }

    public static void main(String[] args) {
        System.out.println(new ThisInConstructor().foo);
    }
}
