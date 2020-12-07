package com.oriented;

public class HideTest {
    public static void main(String[] args) {
        Derived d=new Derived();
        //d.tag="11";
        System.out.println(d.tag);
        //不可访问d的私有变量，将d变量显示地向上转型为Parent
        System.out.println(((Parent)d).tag);
    }
}
