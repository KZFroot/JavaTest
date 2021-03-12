package com.oriented;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d1=new Date();
        //获取当前时间之后的100ms的时间
        Date d2=new Date(System.currentTimeMillis()+100);
        System.out.println(d2);
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.before(d2));
        //创建一个Calendar对象
        Calendar calendar=Calendar.getInstance();
        //从Calendar对象中获取Date对象
        Date date=calendar.getTime();
        //通过Date对象获取Calendar对象
        //因为Calendar/GregorianCalendar没有构造函数可以接收Date对象
        //所以必须先获得一个Calendar实例，然后调用其setTime()方法
        Calendar calendar2=Calendar.getInstance();
        calendar2.setTime(date);

    }
}
