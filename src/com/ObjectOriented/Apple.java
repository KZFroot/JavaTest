package com.ObjectOriented;

public class Apple {
    private String color;
    private double weight;

    public Apple() {
    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    //从写set get方法
    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //重写toString方法,用于实现apple的自我描述

    @Override
    public String toString() {
        return "一个苹果" +
                "颜色是" + color +
                "重量是" + weight;
    }

    public static void main(String[] args) {
        Apple a = new Apple("红色", 5.68);
        //打印apple对象
        System.out.println(a);
    }
}
