package com.ObjectOriented;

public class Circle extends Shape{
    private double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    //重写Shape类的计算周长的抽象方法
    public double callPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return getColor()+"圆形";
    }

    public static void main(String[] args) {
        Shape s1=new Triangle("黑色",3,4,5);
        Shape s2=new Circle("黄色",3);
        System.out.println(s1.getType());
        System.out.println(s1.callPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.callPerimeter());
    }
}
