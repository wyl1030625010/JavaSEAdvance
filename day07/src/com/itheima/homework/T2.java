package com.itheima.homework;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * 请输入“您的生日”，格式：yyyy-MM-dd，使用程序计算您已经来到这个世界多少天了。
 */
public class T2 {
    public static void main(String[] args) {
        String birthday = "1996-10-14";

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate birDate = LocalDate.parse(birthday, pattern);
        LocalDateTime birDateTime = LocalDateTime.of(birDate, LocalTime.of(0, 0, 0));
        LocalDateTime nowDate = LocalDateTime.now();

        Duration betDate = Duration.between(birDateTime, nowDate);
        System.out.println("我活了" + betDate.toDays() + "天");
    }
}
