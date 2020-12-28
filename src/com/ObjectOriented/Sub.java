package com.ObjectOriented;

public class Sub extends FinalMethodTest{
    //下面方法定义出现编译错误 不能重写final方法
//    public void test(){
//        System.out.println(111);
//    }

    public static void main(String[] args) {
        Sub sb=new Sub();
        sb.test();
    }
}
