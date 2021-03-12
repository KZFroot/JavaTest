package com.oriented;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class NewDatePackageTest {
    public static void main(String[] args) {
        //关于Clock的用法 获取当前的clock
        Clock clock=Clock.systemUTC();
        //Clock获取当前时刻
        System.out.println("当前时刻为："+clock.instant());
        //获取clock对应的毫秒数,与System.currentTimeMillis()输出相同
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());
        //关于Duration的用法
        Duration d=Duration.ofSeconds(6000);
        System.out.println("6000秒相当于"+d.toMinutes()+"分");
        System.out.println("60000秒相当于"+d.toHours()+"时");
        System.out.println("6000秒相当于"+d.toDays()+"天");
        //关于Instant的用法
        Instant instant=Instant.now();
        System.out.println(instant);
        //instant添加6000秒(即100分钟) 返回新的Instant
        Instant instant2=instant.plusSeconds(60000);
        System.out.println(instant2);
    }
}
