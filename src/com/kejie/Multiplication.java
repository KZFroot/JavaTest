package com.kejie;

public class Multiplication {

    public static void printTopCenter(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("   ");
            }
            //左半部分
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            //右半部分
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //九九乘法表
    public static void nie() {
        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }

        int x, y;

        for (x = 0; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTopCenter(4);
        nie();
    }
}

