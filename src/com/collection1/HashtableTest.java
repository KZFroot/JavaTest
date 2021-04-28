package com.collection1;
import java.util.Hashtable;

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put(new J(60000),"疯狂Java讲义");
        ht.put(new J(87563),"轻量级JavaEE企业应用实践");
        ht.put(new J(1232),new K());
        System.out.println(ht);
        //只要两个对象通过equals()方法比较返回true
        //Hashtable就认为它们是相等的value
        //由于Hashtable中有一个B对象
        //它与任何对象通过equals()方法比较都相等 所以下面输出true
        System.out.println(ht.containsValue("测试字符串"));
        //只要两个A对象的count相等,它们通过equals()方法比较返回true,hashCode值相等
        //Hashtable即认为它们是相同的key 所以下面输出true
        System.out.println(ht.containsKey(new J(87563)));
        //下面语句可以删除最后一个key-value对
        ht.remove(new J(1232));
        System.out.println(ht);
    }
}
