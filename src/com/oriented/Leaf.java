package com.oriented;

public class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf() {
        //通过Super调用父类有一个字符串参数的构造器
        super("疯狂的食堂");
        System.out.println("执行Leaf的无参构造");
    }
}
