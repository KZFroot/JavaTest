package com.oriented;

public class ScopeTest {
    //定义一个类成员变量作为循环变量
    public static int i;

    public static void main(String[] args) {
        for (i=0;i<10;i++){
            System.out.println("hello");
        }
    }
}
