package com.itheima.class_code;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo06_jdk8Date {
    public static void main(String[] args) {
        String bitrhday = "1996-10-14 00:00:00";

        //创建格式化器
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //解析生日字符串
        LocalDateTime birDateTime = LocalDateTime.parse(bitrhday, pattern);
        //计算退休年龄 生日年龄年份+60
        LocalDateTime backDateTime = birDateTime.plusYears(60);
        System.out.println(backDateTime);

        //获取今天的日期时间
        LocalDateTime nowDateTime = LocalDateTime.now();

        //获取生日到今天的日期间隔
        Period age = Period.between(birDateTime.toLocalDate(), nowDateTime.toLocalDate());
        //获得过了多少年
        System.out.println("今年" + age.getYears() + "岁");

        //获取生日到今天的时间间隔
        Duration duration = Duration.between(birDateTime, nowDateTime);
        //获得一共过了多少天
        System.out.println("活了" + duration.toDays() + "天");

        //获取今天到退休日期的时间间隔
        Duration back = Duration.between(nowDateTime, backDateTime);
        //获得还需多少天
        System.out.println("还有" + back.toDays() + "天退休");
    }
}
