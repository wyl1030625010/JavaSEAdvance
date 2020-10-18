package com.itheima.class_code;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo02_jdk8Date {
    public static void main(String[] args) {
        String date = "2020年12月32日 00:00:00";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(date, dateTimeFormatter);
        LocalDateTime localDateTime = parse.plusDays(1);
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);
    }
}
