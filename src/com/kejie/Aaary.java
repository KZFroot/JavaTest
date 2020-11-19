package com.kejie;

public class Aaary {
    public static void main(String[] args) {
        //数组
        //Java要求所有数组的元素具有相同类型 因此在一个数组中，数组元素的类型是唯一的，即一个数组只能存储一种数据类型
        //数组属于引用数据类型 int是基本数据类型 但int[]就是引用数据类型
        //定义数组 type[]arrayName(推荐使用，具有更好的可读性)  type arrayName [];
        //数组初始化就是为了数组元素分配内存空间，并为每个数组元素赋初始值;
        //静态初始化
        int[] intArr;
        //使用静态初始化，初始化数组时只指定数组元素的初始值，不指定数组长度
        intArr=new int[] {5,6,8,20};
        int [] intArr1={6,7,8,9,10};
        //动态化初始值  动态初始化只能指定数组的长度，由于系统为每个数组元素指定初始值
        Object [] books=new String[5];
        //对动态初始化的数组进行赋值
        books[0]="疯狂Java讲义";
        books[1]="轻量级JavaEE企业应用实践";
        //使用循环输出books数组的每一个元素
//        for (int i=0;i<books.length;i++){
//            System.out.println(books[i]);
//        }

        //foreach循环来遍历元素
        String [] name={"轻量级JavaEE企业应用实践","疯狂的Java讲义","疯狂的android讲义"};
        //使用foreach循环遍历数组元素，其中name将会自动迭代每个数组,foreach中的循环变量相当于一个临时变量，
        //使用foreach循环迭代数组时，并不能改变数组的值，因此不要对foreachd的循环变量进行赋值
        for (String name1:name) {
            //name1="疯狂的and";  
            System.out.println(name1);
            System.out.println("测试代码提交");
        }
        //System.out.println(name[0]);
    }
}
