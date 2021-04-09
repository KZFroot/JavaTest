package com.collection1;

public class C {
    //类C的hashCode()方法总是返回2，且重写其equals()方法总是返回true


    public int hashCode() {
        return 2;
    }
    public boolean equals(Object obj){
        return true;
    }
}
