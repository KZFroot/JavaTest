package com.oriented;

public class ClassVariables {
    //类变量 只要类存在，程序就可以访问该类的类变量 语法：类.类变量  static修饰
    //实例变量 作为实例的一个成员,与实例共存亡 实例.实例变量
    //类变量也可以让该类的实例访问 实例.类变量
    //定义一个实例变量
    public String name;
    //定义一个类变量
    public static int eysNum;

    public static void main(String[] args) {
        //主动使用类访问类变量
        System.out.println("eysNum类变量的值" + eysNum);
        //创建实例对象
        ClassVariables c = new ClassVariables();
        //通过对象引用 访问对象name实例变量,并通过实例访问类变量
        System.out.println("通过引用访问实例变量" + c.name + "通过引用访问类变量" + c.eysNum);
        //给实例变量赋值
        c.name="大傻逼";
        //通过c访问的类变量，依然是ClassVariables的类变量
        c.eysNum=1;
        System.out.println("赋值过后的类变量"+eysNum);
        //类变量的作用域比实例变量的作用域更大；实例变量随着实例的存在而存在，而类变量随着类的存在而存在，
        // 同一个类中的所有实例访问一个类变量时，实际是访问同一片内存区
        //通过实例来访问类变量可替换类本身来访问static成员变量的情形，这样可以提高程序的可读性
        //通过实例对象访问类变量时，无论哪个对象 访问的都是类变量
    }
}
