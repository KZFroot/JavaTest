package com.ObjectOriented;

public class OverrideEqualsError1 {
    public static void main(String[] args) {
        Person p1 = new Person("孙悟空", "11111111111");
        Person p2 = new Person("孙行者", "11111111121");
        Person p3 = new Person("孙", "11111111111");
        System.out.println("p1和p2是否相等？" + p1.equals(p2));
        System.out.println("p1和p3是否相等？" + p1.equals(p3));
    }
    //Object类的equals()方法比较的结果与==运输符比较的结果完全相同，equals()方法只是比较对象的地址
}