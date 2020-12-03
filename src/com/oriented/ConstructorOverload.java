package com.oriented;

public class ConstructorOverload {
    public String name;
    public int count;

    //提供无参构造器
    public ConstructorOverload() {
    }
    //提供带有两个参数的构造器
    //对该构造器返回的对象执行初始化
    ConstructorOverload(String name,int count){
        this.name=name;
        this.count=count;
    }

    public static void main(String[] args) {
        //通过无参构造创建ConstructorOverload对象
        ConstructorOverload oc1=new ConstructorOverload();
        //通过有参构造创建ConstructorOverload对象
        ConstructorOverload oc2=new ConstructorOverload("轻量级JAVAEE企业应用实战",11);
        System.out.println(oc1.name+""+ oc1.count);
        System.out.println(oc2.name+""+oc2.count);
    }

}
