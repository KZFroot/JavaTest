package com.kejie;

import javax.swing.plaf.IconUIResource;

public class Nestedoop {
    public static void main(String[] args) {
        //嵌套循环
        //外层循环
//        int k=0;
//        for (int i=0;i<5;i++){
//             //内层循环
//            for (int j=0;j<3;j++){
//                System.out.println("i的值为"+i+";j的值为"+j);
//            }
//            k++;
//            System.out.println(k);
//        }

        //使用return结束方法

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            if (i == 1) {
                continue;
            }
            System.out.println("return后的语句");
        }

    }

}
