package com.kejie;

public class Cycle {
    public static void main(String[] args) {
        //while 循环语句  初始循环语句 循环条件 循环体 迭代语句
        //循环的初始条件
//        int count =0;
//        //当count小于10时，执行循环体
//        while (count<0){
//            System.out.println(count);
//            //迭代语句
//            count++;
//        }
//        System.out.println("循环结束");
//
//        //do while循环与while循环的区别在于：while循环是先判断循环条件，如果为真则执行循环体；
//        // 而do while循环先执行循环体，然后才判断循环条件，
//        //for 循环允许同时指定多个初始化语句，循环条件也可以是一个包含逻辑运算符的表达式
//
//        int count1=1;
//        do {
//            System.out.println(count1);
//            //循环迭代语句
//            count1++;
//        }while (count1<10);
//            System.out.println("循环结束");

        //for循环格式更加简洁的循环语句，大部分情况下，for循环可以代替while循环，do while循环
        //循环的初始条件 循环条件 循环迭代语句都在一行
//        for (int i=0,j=0; i<10&&j<10; i++,j++){
//            System.out.println(i);
//            System.out.println(j);
//        }
   //     System.out.println("循环结束");

        //死循环
//        for (;;){
//            System.out.println("===========");
//        }
        int temp=0;
        for (int i=0;i<10;i++){
           // System.out.println(i);
            temp=i;
            System.out.println("temp是"+temp);
        }
        System.out.println("循环结束");
    }
}
