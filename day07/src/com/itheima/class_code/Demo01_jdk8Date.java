package com.itheima.class_code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo01_jdk8Date {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);

        LocalDateTime of = LocalDateTime.of(1111, 11, 11, 11, 11, 11);
        System.out.println(of);

    }
}
