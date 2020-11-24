package com.oriented;

public class Dog {
    //定义一个jump
    public void jump(){
        System.out.println("正在执行jump方法");
    }
    //定义一个run方法 run()方法需要调用jump方法
    public void run(){
        jump();
        System.out.println("正在执行run方法");
    }

}
