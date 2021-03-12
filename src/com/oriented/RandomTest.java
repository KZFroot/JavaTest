package com.oriented;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("random.nextBoolean():" + random.nextBoolean());
        byte[] buffer = new byte[16];
        random.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        //生成0.0~1.0的伪随机double数
        System.out.println("random.nextDouble():"+random.nextDouble());
        //生成0.0~0.1之间的伪随机数float数
        System.out.println("random.nextFloat():"+random.nextFloat());
        //生成平均值是0.0，标准差是1.0的伪高斯数
        System.out.println("random.nextGaussian():"+random.nextGaussian());
        //生成一个处于int整数取值范围的伪随机数
        System.out.println("random.nextInt():"+random.nextInt());
        //生成0~26之间的伪随机数
        System.out.println("random.nextInt(26)"+random.nextInt(26));
        //生成一个处于long整数取值范围的伪随机整数
        System.out.println("random.nextLong():"+random.nextLong());
    }
}
