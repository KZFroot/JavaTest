package com.oriented;

public class Ostrich extends Bird{
    //子类 重新Bird的fly方法
    public void fly(){
        System.out.println("我只能在地上奔跑");
    }
    //super限定
    public void callOverrideMethod(){
        //在子类方法中通过super显示调用父类被覆盖的方法
        //super是Java提供的关键字，super用于限定该对象调用它从父类继承得到的实例变量或方法;super不能出现在static修饰的方法中
        super.fly();
    }
    public static void main(String[] args) {
        //创建Ostrich对象
        Ostrich os=new Ostrich();
        //执行Ostrich对象的fly()方法
        os.fly();
        os.callOverrideMethod();
    }
    //其实把重载和重写放在一起比较本身没有太大意义，因为重载主要发生在同一个类的多个同名方法之间,
    //他们之间的联系很少,除了二者都是发生在方法之间,并要求方法名相同之外，没有太大的相似之处。当然父类方法和子类的方法之间可能发生重载
    //因为子类会获得父类的方法,如果子类定义了一个方法与父类方法有相同的方法名,但参数列表相同的方法，就会形成父类和子类方法的重载
    //当程序创建一个子类对象时，系统不仅会为该类中定义的实例变量分配内存，也会为它从父类继承得到的所有实例变量分配内存
    //即使子类定义了与父类中同名的实例变量。也就是说，当系统创建一个Java对象时，如果该Java类有两个父类，则Java对象会保存父类所创建的所有实例变量
}
