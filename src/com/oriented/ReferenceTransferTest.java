
package com.oriented;

public class ReferenceTransferTest {
    public static void swap(DateWrap dw){
        //定义临时变量存储变量a的值
        int tmp= dw.a;
        dw.a=dw.b;
        //把临时变量赋值给dw对象的b成员变量
        dw.b=tmp;
        System.out.println("swap方法中，a成员变量的值是"+dw.a+"b成员变量的值是："+dw.b);
    }

    public static void main(String[] args) {
        //与基本数据类型不同，创建对象时，系统内种有两个东西，堆内存保存了对象本身，栈内存保存了引用对象的引用变量
        //系统会分别为main()和swap()开辟出两个栈区，用于存储局部变量
        //main()方法中的dw是一个引用，保存DateWrap对象的地址值，当把dw的值赋给swap()方法的dw形参后，swap()方法也保存了这个地址值
        //dw只是一个引用变量，复制dw变量，但并未复制DateWrap对象，
        // 不管是main()方法里的dw()变量，还是swap方法的dw()参数，他们操作的是同一个对象，
        DateWrap dw=new DateWrap();
        dw.a=6;
        dw.b=9;
        swap(dw);
        System.out.println("交换结束后，a成员变量的值是"+dw.a+":b成员变量的值是："+dw.b);
    }

}
