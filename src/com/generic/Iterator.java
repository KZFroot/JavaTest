package com.generic;

public interface Iterator <E>{
    //在接口里E完全作为类型使用
    E next();
    boolean hashNext();
}
