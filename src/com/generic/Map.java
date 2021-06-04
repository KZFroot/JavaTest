package com.generic;

import java.util.Set;

public interface Map <K,V>{
    //在该接口里K v完全可以作为类型使用
    Set<K> keySet();
    V put(K key,V value);
}
