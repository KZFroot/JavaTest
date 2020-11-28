package com.oriented;

public class OverloadVarargs {
    //重载的方法里包含长度可变的形参
    public void test(String msg){
        System.out.println("只有一个字符串的test方法");
    }
    //可变参数的test方法
    public void test(String... books){
        System.out.println("*****形参可变的test方法*******");
    }

    public static void main(String[] args) {
        OverloadVarargs ol=new OverloadVarargs();
        ol.test();
        ol.test("aa","bb");
        ol.test("aa");
        ol.test(new String[]{"AA"});
    }
}
