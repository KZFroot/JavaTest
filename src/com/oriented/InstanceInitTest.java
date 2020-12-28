package com.oriented;

public class InstanceInitTest {
    //先执行初始化块a实例变量赋值为6
    {
        a=6;
    }
    //再将实例变量赋值为9
    int a=9;
    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
    }
}
