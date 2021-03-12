package com.oriented;

import java.math.BigDecimal;

public class Arith {
    //默认除法运算精度
    private static final int DEF_DIV_SCALE=10;
    //构造器私有 让这个类不能被实例化
    private Arith(){}
    //提供精确的加法运算
    private static double add(double v1,double v2){
        BigDecimal b1= BigDecimal.valueOf(v1);
        BigDecimal b2= BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }
    //提供精确的减法运算
    private static double sub(double v1,double v2){
        BigDecimal b1= BigDecimal.valueOf(v1);
        BigDecimal b2= BigDecimal.valueOf(v2);
        return b1.subtract(b2).doubleValue();
    }
    //提供精确的乘法
    private static double mul(double v1,double v2){
        BigDecimal b1= BigDecimal.valueOf(v1);
        BigDecimal b2= BigDecimal.valueOf(v2);
        return b1.multiply(b2).doubleValue();
    }
    //提供(相对)精确的除法运算 当发生除不尽时
    // 精确到小数点以后10位的数组四舍五入
    private static double div(double v1,double v2){
        BigDecimal b1= BigDecimal.valueOf(v1);
        BigDecimal b2= BigDecimal.valueOf(v2);
        return b1.divide(b2,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("0.05+0.01="+Arith.add(0.05,0.01));
        System.out.println("0.05-0.01="+Arith.sub(0.05,0.01));
        System.out.println("1*2="+Arith.mul(1,2));
        System.out.println("12/1="+Arith.div(12,100));
    }
}
