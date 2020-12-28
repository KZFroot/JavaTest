package com.ObjectOriented;

public abstract class Shape {
    //抽象方法和抽象类必须使用abstract修饰定义，有抽象方法的类只能被定义为抽象类，抽象类里可以没有抽象方法
    //规则如下
    //抽象类必须使用abstract修饰符来修饰,抽象方法也必须使用abstract修饰符来修饰,抽象方法不能有方法体
    //抽象类不能被实例化 无法使用new关键字来调用抽象类的构造器创建抽象类的实例。即抽象类里不包含抽象方法 这个抽象类也不能创建实例
    //抽象类可以包含成员变量 方法(普通方法和抽象方法都可以)丶构造器丶初始化模块丶内部类(接口 枚举)5种成分 抽象类的构造器也不能创建实例，主要用于被其子类调用
    //含有抽象方法的类只能被定义为抽象类
    {
        System.out.println("执行shape的初始化块......");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    //定义一个计算周长的抽象方法
    public abstract double callPerimeter();

    //定义一个返回形状的抽象方法
    public abstract String getType();

    //定义Shape的构造器 该构造器并不是用于创建Shape对象
    //而是用于被子类调用
    public Shape() {
    }

    public Shape(String color) {
        System.out.println("执行Shape的构造器...");
        this.color = color;
    }

}
