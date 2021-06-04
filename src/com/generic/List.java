package com.generic;

import java.util.Iterator;

/**
 *
 * @param <E>
 * 所谓泛型 就是允许在定义接口 类 方法时使用类型形参,这个类型形参将在声明变量丶创建对象丶调用方法时动态的指定(即传入实际的类型参数，也可以称为类型实参)
 */
//定义一个接口时指定一个类型形参
public interface List <E>{
    //在接口里 E可以做类型参数使用
    //下面方法可以使用E作为参数类型
    void add(E x);
    Iterator<E> iterator();
}
