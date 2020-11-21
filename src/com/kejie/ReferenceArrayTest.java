package com.kejie;

public class ReferenceArrayTest{
    public static void main(String[] args) {
        //定义一个students数组变量，其类型是Person[]
        Person [] students;
        //执行动态初始化
        students=new Person[2];
        //创建一个Person实例，并将Person的值赋给zhang变量
        Person zhang=new Person();
        //为zhang所引用的Person对象赋值
        zhang.height=15.1;
        zhang.age=12;
        //创建一个Person实例，并将这个Person实例赋值给lee
        Person lee=new Person();
        //为lee所引用的Person对象的age height赋值
        lee.age=13;
        lee.height=18.2;
        //将zhang的变量值赋给第一个数组元素
        students[0]=zhang;
        //将lee的变量值赋给第二个数组元素
        students[1]=lee;
        //结果一致 指向同一个Person实例
        lee.info();
        students[1].info();

    }
}
