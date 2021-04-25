package com.collection1;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        //成对放入多个key-value对
        map.put("疯狂Java讲义",109);
        map.put("疯狂ios讲义",10);
        map.put("疯狂Ajax讲义",79);
        //多次放入的key-value对中value可以重复
        map.put("轻量级JavaEE企业应用实践",99);
        //放入重复的key时，新的value覆盖了原有value 如果覆盖则返回被覆盖的value
        System.out.println(map.put("疯狂ios讲义",99));
        System.out.println(map);
        //判断是否包含指定key
        System.out.println("是否包含值为疯狂ios讲义的key:"+map.containsKey("疯狂iOS讲义"));
        //判断是否包含指定value
        System.out.println("是否包含值为99value:"+map.containsValue(99));
        //获取Map集合的所有key组成的集合 通过遍历key来遍历实现key-value对
        for (Object key : map.keySet()){
            //map.get(key)方法获取指定key对于的value
            System.out.println(key+"-->"+map.get(key));
        }
        map.remove("疯狂Java讲义");
        System.out.println(map);
    }
}
