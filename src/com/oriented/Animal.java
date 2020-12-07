package com.oriented;

public class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal带一个参数的构造器,"+"该动物的name为"+name);
    }
    public Animal(String name,int age){
        //使用this调用同一个重载的构造器
        this(name);
        System.out.println("Animal带有两个参数的构造器,"+"其age为"+age);
    }
}
