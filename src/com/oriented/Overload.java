package com.oriented;

public class Overload {
    //方法重载
    //Java允许同一个类定义多个同名的方法，只要形参列表不同就行，如果同一个类中包含了两个或者两个以上方法的方法名相同，但形参不同，则被称为方法重载
    //重载三要素 调用者 方法名  形参列表
    public void test(){
        System.out.println("无参数");
    }
    public void test(String msg){
        System.out.println("test的方法重载"+msg);
    }

    public static void main(String[] args) {
        Overload ol=new Overload();
        //调用test()没有参数传入
        ol.test();
        //传入一个字符串
        ol.test("傻逼");
    }

}
