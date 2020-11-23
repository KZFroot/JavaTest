package com.kejie;

import java.util.Arrays;

public class Num2Rmb {
    private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private String[] unitArr = {"十", "百", "千","万"};

    /**
     * 把一个浮点数分解成整数部分和小数点字符串
     *
     * @param num 需要被分解的浮点数
     * @return 分解出来的整数部分和小数点部分 第一组元素是整数部分 第二组元素是小数部分
     */
    private String[] devide(double num) {
        //将一个浮点数强制类型转换为long型，得到整数部分
        long zheng = (long) num;
        //浮点数减去整数部分的到小数部分，小数部分乘以100后取整得到2位小数
        long xiao = Math.round((num - zheng) * 100);
        //下面用了2种方法把整数转换为字符串
        return new String[]{zheng + "", String.valueOf(xiao)};
    }

    private String toHanStr(String numStr) {
        String result = "";
        int numLen = numStr.length();
        for (int i = 0; i < numLen; i++) {
            //因为char类型转化成int型数字，因为ASCCII码值恰好相差48
            //因此把char类型数字减去48得到int型数字，例如'4'转换为4
            int num = numStr.charAt(i) - 48;
            //如果不是最后一位数字，而且数字不为零，则需要添加单位（千，百，十）
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
            } else {
                //否则不要添加单位
                result += hanArr[num];
            }
        }
        return result;
    }

    //测试
    public static void main(String[] args) {
        Num2Rmb nr = new Num2Rmb();
        //把一个浮点数分解成整数部分和小数部分
        System.out.println(Arrays.toString(nr.devide(234567111.12334)));
        //测试把一个四位的数字字符串变成汉字字符串
        System.out.println(nr.toHanStr("10010"));
    }
}
