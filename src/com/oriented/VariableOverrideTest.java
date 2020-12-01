package com.oriented;

public class VariableOverrideTest {
    //定义一个name实例变量
    private String name="李刚";
    //定义一个类变量
    private static double price=78.0;

    public static void main(String[] args) {
        //方法内的局部变量，局部变量覆盖成员变量
        int price=25;
        System.out.println(price);
        //使用类名作为限定输出类变量
        System.out.println(VariableOverrideTest.price);
        //调用info
        new VariableOverrideTest().info();
    }
    public void info(){
        //方法里的局部变量 覆盖成员变量
        String name="大傻逼";
        System.out.println(name);
        //输出实例变量name
        System.out.println(this.name);
    }

}
