package com.oriented;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        //取出年
        System.out.println(c.get(Calendar.YEAR));
        //取出月
        System.out.println(c.get(Calendar.MONTH));
        //取出日
        System.out.println(c.get(Calendar.DATE));
        //分别设置年 月 日 小时 分钟 秒
        c.set(2003,7,22,12,23,22);
        System.out.println(c.getTime());
        //将Calendar的月往前推8个月
        c.roll(Calendar.MONTH,-8);
        System.out.println(c.getTime());
        Calendar call=Calendar.getInstance();
        call.set(2003,7,23,0,0,0);
        call.add(Calendar.MONTH,6);
    }
}
