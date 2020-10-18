package com.itheima.class_code;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo04_jdk8Date {
    public static void main(String[] args) {
        localTimeFormatter();
        localTimeParse();
    }

    private static void localTimeParse() {
        String dateTime = "2020年10月17日 11:43:22";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(LocalDateTime.parse(dateTime, pattern));
    }

    private static void localTimeFormatter() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 17, 11, 43, 22);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(localDateTime.format(pattern));
    }
}
