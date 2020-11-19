package com.kejie;

public class TernaryOperator {
    //三元运算符  条件表达式的结果为boolean类型 真或假执行表达式1 或者 表达式2
    // 表达式1和表达式2要求一致
    public static void main(String[] args) {
        int m = 12;
        int n = 5;
        int min = (m > n) ? 1 : 2;
        System.out.println(min);
        String str = 5 > 3 ? "5大于3" : "5小于3";
        System.out.println(str);
        //大部分的时候三目运算符都是作为if else的精简写法 换成if else的写法
        String str2 = null;
        if (5 > 3) {
            str2 = "5大于3";
        } else {
            str2 = "5小于3";
        }
        //三目运算符和if else写法的区别在于：if后的代码块可以有多个语句 但三目运算符是不支持多个语句的
        // 三目运算符可以嵌套，嵌套后的三目运算符可以处理复杂情况
        int a=12;
        int b=12;
        System.out.println(a>b?"a大于b":(a<b?"a小于b":"a等于b"));
    }
}
