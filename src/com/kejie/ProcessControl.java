package com.kejie;

public class ProcessControl {
    //分支结构 Java提供两种常见的分支控制结构：if语句和switch语句，其中if语句使用布尔表达式或布尔值作为分支条件就行分支控制；
    // 而switch语句则用多个整数型进行匹配，从而实现分支控制。如果if和else的代码块只有一行语句时，则花括号可以省略，
    // 单行语句本身是一个整体，保留花括号可读性更强  使用if else 一定不要忽略else所带的隐含条件
    // 规则：总是把包含范围小的条件放前面处理
    public static void main(String[] args) {
        int age=25;
        if (age>60){
            System.out.println("你是个老人了");
        }else if(age>20){
            System.out.println("青年人");
        }

    }
}
