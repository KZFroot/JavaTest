package com.kejie;

public class Variable {
    //浮点型  float(4个字节)  double(8个字节)
    //1 浮点型 表示带小数点的数值  float表示范围比long还大
    public static void main(String[] args) {
        double d1=123.1;
        System.out.println(d1);
        //定义float类型变量时，变量要以“f” 或 F结尾
        float f1=12.3f;
        System.out.println(f1);

        //字符型  char(1字符=2字节  char=2byte) 通常使用一对‘’，内部只能写一个字符，多个字符用字符串
        char c1='a';
        c1='A';
        System.out.println(c1);

        //表示方式  1，声明一个字符  2转义字符
        char c5='\n';
        System.out.println("hello"+c5);
        System.out.println("world");

        char c6='\u0043';
        System.out.println(c6);

        System.out.println("你好 中国");

        //boolean 只能取两个值之一 ture false
        boolean a=true;

        boolean b=false;
        if (a){
            System.out.println("你是a");
        }else {
            System.out.println(b);
        }




    }
}
