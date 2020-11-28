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
        //如果需要定义方法，只能在类中定义，不能独立定义一个方法，一旦将一个方法定义在一个类的类体内，如果这个方法用static修饰，则这个方法属于类，否则这个方法属于类的实例
        //同一个类的一个方法调用另外一个方法时，如果被调方法是普通方法时，则默认使用this作为调用者;如果被调用方法是静态方法，则默认类作为调用者；
        System.out.println(new ThisInConstructor().foo);
    }
}
