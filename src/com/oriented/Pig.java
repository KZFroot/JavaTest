package com.oriented;

public class Pig {
    //使用private修饰成员变量，将这些成员变量隐藏起来
    private String name;
    private int age;

    //提供方法操作name成员变量
    public void setName(String name) {
        //提供合理性校验，要求用户名必须在2~6位之间
        if (name.length() > 6 || name.length() < 2) {
            System.out.println("你设置的姓名不合法");
            return;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    //提供方法操作age变量
    public void setAge(int age) {
        //提供合理性校验,要求用户年纪必须在0~100之间
        if (age > 100 || age < 0) {
            System.out.println("你设置的年纪不合法");
            return;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age = age;
    }


}
