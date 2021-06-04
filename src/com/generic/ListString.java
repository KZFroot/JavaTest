package com.generic;

import java.util.Iterator;

public interface ListString extends List {
    //原来的E形参全部变成String类型实参
    void add(String x);

    Iterator iterator();
}
