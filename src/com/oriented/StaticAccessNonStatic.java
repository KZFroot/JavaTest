package com.oriented;

public class StaticAccessNonStatic {
    public void info(){
        System.out.println("简单的info方法");
    }

    //static修饰的方法相当于一个类 不能直接调用实例方法
    public static void main(String[] args) {
        //main方法是静态方法 而info()是非静态方法
        //因为main()方法是该类本身 不是该类的实例
        //因此省略的this无法指向有效的对象
        new StaticAccessNonStatic().info();
    }
}
