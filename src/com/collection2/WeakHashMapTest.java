package com.collection2;
import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap whm = new WeakHashMap();
        //向WeakHashMap中添加三个key-value对
        //三个key都是匿名字符串对象(没有其他引用)
        whm.put(new String("语文"), new String("良好"));
        whm.put(new String("数学"), new String("及格"));
        whm.put(new String("英文"), new String("中等"));
        //向WeakHashMap中添加一个key-value对
        whm.put("java",new String("中等"));
        System.out.println(whm);
        //通知系统立即进行垃圾回收
        System.gc();
        System.runFinalization();
        //在通常情况下 将只看到一个key-value对
        System.out.println(whm);
        //系统垃圾回收时 删除前三个key-value对 这三个key都是匿名字符串对象
        // 第4个key是一个字符串直接量(系统会自动保留对该字符串对象的强引用) 所以垃圾回收时不会回收他
    }
}
