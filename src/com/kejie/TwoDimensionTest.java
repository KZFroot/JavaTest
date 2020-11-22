package com.kejie;

public class TwoDimensionTest {
    public static void main(String[] args) {
        //定义一个二维数组
        //Java是强类型语言 定义a数组的数组元素是int[]类型，则a[0]的数组类型只能存储int类型变量，object[] 类型可以扩展多维数组
        //结论：二维数组是一维数组，其数组元素也是一维数组 java语言没有多维数组
        int[][] a;
        //把a当成一维数组进行初始化，初始化a是一个长度为4的数组
        //a的数组元素又是引用类型
        a = new int[4][];
        //把a当成一维数组，遍历a数组的每一个元素
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.println(a[i]);
        }
        //初始化a数组的第一个元素
        a[0] = new int[2];
        //访问a数组的第一个元素所指数组的第二个元素
        a[0][0] = 5;
        a[0][1] = 6;
        //System.out.println(a[0][1]);
        //遍历a数组的第一个元素，是个一维数组

        for (int i = 0, len = a[0].length; i < len; i++) {
            System.out.println(a[0][i]);
        }
        //同时初始化二维数组的两个维数
        int[][] b = new int[3][4];
        int num=0;
        for (int i = 0, len = b.length; i < len; i++) {
            for (int j=0,aen =b[0].length;j<aen;j++){
                System.out.println(b[i][j]);
                num=num+1;
            }
        }
        System.out.println(num);
        //使用静态初始化语法来初始化一个二维数组
        String [] [] str1=new String[][]{new String[3],new String[]{"hello"}};
        //简化静态初始化二维数组
        String [] [] str2={new String[3],new String[]{"hello"}};
        System.out.println(str1[1][0]);
    }

}
