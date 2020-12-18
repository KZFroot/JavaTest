package com.ObjectOriented;

public class StringCompareTest {
    public static void main(String[] args) {
        //s1直接引用常量池的“疯狂的JAVA”
        String s1="疯狂JAVA";
        String s2="疯狂";
        String s3="JAVA";
        //s4后面的字符串值可以在编译时就确定下来
        String s4="疯狂"+"JAVA";
        //
        String s5="疯"+"狂"+"JAVA";
        //不能引用常量池中的字符串
        String s6=s2+s3;
        //s7引用堆内存中的新创建一个新的Sting对象
        String s7=new String("疯狂的JAVA");
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s7);
        //JVM常量池保证相同的字符串直接量只有一个，不会产生多个副本，可供以在编译器就确定下来，因此他们引用常量池的同一个字符串对象
        //new String()创建的字符串对象是运行时创建出来的，它被保存在运行时内存区（即堆内存），不会放入常量池
        //程序判断两个引用变量是否相等时，也希望有一种类似于"值相等"的判断规则，
        // 并不严格要求两个引用变量指向同一个对象，可能只是要求它们引用字符串对象包含的字符序列相同即可认为相等。此时String对象的equals()方法进行判断
        //equals()判断两个对象值相等，这个说法并不准确，什么叫值相等？对象如何值相等？
        // 实际上，重写equals()方法就是提供自定义的相等标准，你认为怎样相等，那就怎样相等，一切由你做主。
    }
}
