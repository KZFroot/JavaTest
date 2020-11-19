package com.kejie;

public class ProcessControl1 {
    public static void main(String[] args) {
        //switch语句由一个表达式和多个case标签组成 和if语句不同的是
        //switch语句后面的表达式的数据类型只能是byte short char int四种整数型  不能是布尔型
        // java7增强了switch的语句的功能，允许switch语句的控制表达式是java.lang.String类型的变量或表达式--
        // 只能是java.lang.String类型  不能是StingBuffer或StingBuilder这两种字符串类型
        char score='a';
        switch (score) {
            case 'a':
                System.out.println("优秀");
                break;
            case 'b':
                System.out.println("良好");
                break;
            case 'c':
                System.out.println("差劲");
                break;
            default:
                System.out.println("输入错误");
        }

        String season="";
        switch (season){
            case "春天":
                System.out.println("出暖花开");
                break;
            case"夏天":
                System.out.println("烈日炎炎");
                break;
            case "秋天":
                System.out.println("秋高气爽");
                break;
            case"冬天":
                System.out.println("白雪皑皑");
                break;
            default:
                System.out.println("一年四季 哪个季节你最喜欢");
        }
    }
}
