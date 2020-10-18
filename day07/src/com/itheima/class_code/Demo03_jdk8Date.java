package com.itheima.class_code;

import java.time.LocalDateTime;

public class Demo03_jdk8Date {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2020, 10, 17, 11, 11, 11, 11);

        System.out.println("年为：" + of.getYear());

        System.out.println("月为：" + of.getMonthValue());

        System.out.println("该月日期为：" + of.getDayOfMonth());

        System.out.println("该年中的几天数为：" + of.getDayOfYear());

        System.out.println("星期为：" + of.getDayOfWeek());

        System.out.println("小时为：" + of.getHour());

        System.out.println("分钟为：" + of.getMinute());

        System.out.println("秒数为：" + of.getSecond());

        System.out.println("纳秒为：" + of.getNano());

        System.out.println(of.toLocalDate());

        System.out.println(of.toLocalTime());

        System.out.println(of.toString());
    }
}
