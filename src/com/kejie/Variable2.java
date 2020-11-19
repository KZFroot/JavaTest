package com.kejie;

public class Variable2 {
    //基本数据类型之间的运算 七种数据类型之间的运算
    //自动类型转换 ：当容量小的数据类型的变量与容量大的数据类型做运算时，结果自动提升为容量大的数据类型
    //byte short  char-->int-->long-->float-->double
    //char short byte 三者之间做运算结果为int类型接收；

    //强制类型转换
    public static void main(String[] args) {
        byte b1 =2;
        int i1=129;
        double i2=b1+i1;
        System.out.println(i2);
        char c='a';
        short s=10;
        int f=s+s;
        //强制类型转换需要使用强转符 强制类型转换可能导致精度损失
        //整形常量默认为int 型  浮点型默认为double类型
        double d1=12.3;
        int i3=(int)d1;

        int i4=128;
        byte b2=(byte)i4;
        System.out.println(b2);//精度损失

        long l=12312311111l;

        float f1=12.3f;
    }


}
