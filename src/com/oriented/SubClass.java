package com.oriented;

public class SubClass extends BaseClass{
    //重新定义一个book实例变量隐藏父类的book实例变量
    public String book="轻量级JAVAEE企业应用实战";
    public void test(){
        System.out.println("子类的覆盖父类的方法");
    }
    public void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        //下面编译时类型和运行时类型完全一样，因此不存在多态
        BaseClass bs=new BaseClass();
        System.out.println(bs.book);
        //调用BaseClass的方法
        bs.base();
        bs.test();
        //面编译时类型和运行时类型完全一样，因此不存在多态
        SubClass sb=new SubClass();
        System.out.println(sb.book);
        sb.base();
        sb.test();
        //编译时和运行时不一样，多态发生
        BaseClass sc=new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        //sc.sub();
        //因为子类其实是特殊的父类，因此JAVA允许把一个类对象直接赋给父类引用变量，无需任何转换，
        // 当运行时调用该引用变量方法时，其方法行为总是表现出子类方法的特征，而不是父类的行为特征，
        // 这就可能出现：相同类型的变量 调用同一个方法时呈现出多种不同的行为特征，这就是多态
        //与方法不同的是程序中的实例变量则不具备多态性，因此输出BaseClass类的实例变量
    }

}
