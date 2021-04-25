package com.collection1;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map map=new HashMap();
        //成对的放入多个key-value对
        map.put("疯狂Java讲义",109);
        map.put("疯狂iOS讲义",99);
        map.put("疯狂Ajax讲义",79);
        //尝试替换key为"疯狂的XML讲义"的value 由于原Map中没有对应的key
        //因此Map没有改变 不会添加新的key-value对
        map.replace("疯狂的XML讲义",66);
        System.out.println(map);
        //使用原value与传入参数计算出来的结果覆盖原有的value
        map.merge("疯狂iOS讲义",10,(odlVal,param)->(Integer)odlVal+(Integer)param);
        System.out.println(map);
        //当key为"Java"对应的Value为null(或不存在)时 使用计算的结果作为新value
        map.computeIfAbsent("Java",(key)->((String)key).length());
        System.out.println(map);
        //当key为"Java"对应的Value存在时 使用计算结果作为新的value
        map.computeIfPresent("Java",(key,value)->(Integer)value*(Integer)value);
        System.out.println(map);
    }
}
