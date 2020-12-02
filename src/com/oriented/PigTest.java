package com.oriented;

public class PigTest {
    public static void main(String[] args) {
        Pig p1=new Pig();
        //设置成员变量
        p1.setName("李刚");
        p1.setAge(15);
        System.out.println("成功设置后的成员变量姓名"+p1);
    }
}
