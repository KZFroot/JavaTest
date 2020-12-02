package com.oriented;

public class Test {
    public static void main(String[] args) {
        //将person对象实例赋给p
        Pig p = new Pig();
        //如果访问权限允许，类定义的方法和成员变量都可以通过类或实例来调用
        // static修饰的方法和成员变量，既可以通过类来调用 也可以通过实例来调用，
        // 没有static修饰的普通方法和成员变量只能通过实例来调用
        //当一个对象被创建以后 这个对象保存在堆内存中，java程序不允许直接访问堆内存的对象，只能通过该对象的引用操作该对象
        // ，所以说不管是数组 还是对象 ，都只能通过引用来访问他
        //p.age = 12;
       //  p.info();
        //将p变量赋值给p2,就是把p的引用地址赋值给p2变量，这样p2变量和p变量将指向堆内存里的同一个person对象
       // Pig p2=p;


    }


}
