package com.oriented;

public class MathTest {
    public static void main(String[] args) {
        /*下面是三角运算 */
        //将弧度转换为角度
        System.out.println("Math.toDegrees(1.57):"+Math.toDegrees(1.57));
        // 将角度转换为弧度
        System.out.println("Math.toRadians(90): "+Math.toRadians(90));
        //计算反余弦，返回的角度范围在0.0到pi之间
        System.out.println("Math.acos(1.2):"+Math.acos(1.2));
    }
}
