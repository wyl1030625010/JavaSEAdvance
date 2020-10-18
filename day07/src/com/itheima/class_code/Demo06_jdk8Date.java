package com.itheima.class_code;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo06_jdk8Date {
    public static void main(String[] args) {
        String bitrhday = "1996-10-14 00:00:00";

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime birDateTime = LocalDateTime.parse(bitrhday, pattern);
        LocalDateTime backDateTime = birDateTime.plusYears(60);
        System.out.println(backDateTime);

        LocalDateTime nowDateTime = LocalDateTime.now();

        Period age = Period.between(birDateTime.toLocalDate(), nowDateTime.toLocalDate());
        System.out.println("����" + age.getYears() + "��");

        Duration duration = Duration.between(birDateTime, nowDateTime);
        System.out.println("����" + duration.toDays() + "��");

        Duration back = Duration.between(nowDateTime, backDateTime);
        System.out.println(back);
        System.out.println("����" + back.toDays()+ "������");
    }
}
