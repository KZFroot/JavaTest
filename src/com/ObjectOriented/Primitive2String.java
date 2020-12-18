package com.ObjectOriented;

public class Primitive2String {
    public static void main(String[] args) {
        String intStr="123";
        //把特定字符串转换为int变量
        int it1=Integer.parseInt(intStr);
        System.out.println(it1);
        int it2=new Integer(intStr);
        System.out.println(it2);
        String floatStr="4.56";
        //把特定字符串转换成float变量
        float ft1=Float.parseFloat(floatStr);
        float ft2=new Float(floatStr);
        System.out.println(ft2);
        //把一个float变量转变成String变量
        String ftStr=String.valueOf(2.34f);
        System.out.println(ftStr);
        //把一个boolean变量转换为String变量
        String boolStr=String.valueOf(true);
        System.out.println(boolStr.toUpperCase());
        //基本类型转换为字符串，把基本类型和“”进行运算
        String intStr1=5+"";
        System.out.println(intStr1);
        //包装类型可以与数值类型进行比较
        Integer a=new Integer(6);
        //输出
        System.out.println("6的包装类实例是否大于5.0"+(a>5.0));
    }
}
