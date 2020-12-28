package com.oriented;

public class Student {
    public String name;
    public int age;
    public int phone;
    public String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    //默认构造器
    public  Student(){
        System.out.println("默认构造器");
    }
    //带参数的构造器
    public Student(String name,int age,String address,int phone){
            this.name=name;
            this.address=address;
            this.age=age;
            this.phone=phone;
        System.out.println("带有参数的构造器");
    }
}
