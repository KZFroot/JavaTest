package com.oriented;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Root {
    //静态初始化块也被称为类初始化块，只有当类初始化完成后，才能使用这个类，包括访问这个类的方法 类变量或者用这个类创建实例变量
   //Java系统加载并初始化某个类时，总是保证该类的所有父类全部加载初始化
    static{
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){
        System.out.println("Root的无参构造器");
    }
}
