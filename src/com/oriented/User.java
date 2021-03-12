package com.oriented;

public class User implements Cloneable {
    //实现Cloneable接口
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("广州天河");
    }

    //通过调用super.clone()来实现clone()方法
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }

    //clone只克隆该对象的成员变量 不会对引用类型的成员变量值所引用的对象进行克隆 只是浅克隆
    // 深克隆需要开发者对自己进行递归克隆 保证所有引用类型的成员变量值所引用的对象被复制
    public static void main(String[] args) throws CloneNotSupportedException{
        User u1=new User(29);
        //clone 得到u1对象的副本
        User u2=u1.clone();
        //判断u1和u2是否相等
        System.out.println(u1==u2);
        //判断u1 u2的address是否相同
        System.out.println(u1.address == u2.address);
    }
}
