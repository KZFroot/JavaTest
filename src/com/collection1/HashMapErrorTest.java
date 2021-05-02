package com.collection1;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapErrorTest {
    public static void main(String[] args) {
        HashMap ht = new HashMap();
        //此处的J类与前一个程序的J类是同一个类
        ht.put(new J(60000), "疯狂Java讲义");
        ht.put(new J(87563), "轻量级JavaEE企业应用实践");
        //获取Hashtable的key set集合对应的Iterator迭代器
        Iterator it = ht.keySet().iterator();
        //取出Map中的第一个Key,并修改它的count值
        J first = (J) it.next();
        first.count = 87563;
        System.out.println(ht);
        //只能删除没有被修改过的key所对应的key-value对 即第二个
        ht.remove(new J(87563));
        System.out.println(ht);
        //无法获取剩下的value 下面两行代码都输出null 因为key都被修改过
        System.out.println(ht.get(new J(87563)));
        System.out.println(ht.get(new J(60000)));
    }
}
