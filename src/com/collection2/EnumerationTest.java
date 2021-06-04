package com.collection2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("疯狂Java讲义");
        v.add("轻量级JavaEE企业应用实践");
        Hashtable scores=new Hashtable();
        scores.put("语文",78);
        scores.put("数学",88);
        Enumeration em=v.elements();
        while (em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
        Enumeration keyEm=scores.keys();
        while (keyEm.hasMoreElements()){
            Object key=keyEm.nextElement();
            System.out.println(key+"--->"+scores.get(key));
        }
    }
}
