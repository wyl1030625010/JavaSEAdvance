package com.itheima.class_code;

import java.time.*;

public class Demo05_jdk8Date {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 2, 29, 11, 11, 11);
        LocalDateTime localDateTime1 = LocalDateTime.of(2030, 4, 20, 20, 18, 41);
        System.out.println(localDateTime.plusYears(1));
        System.out.println(localDateTime.minusYears(-1));
        System.out.println(localDateTime.withMonth(10));

        LocalDate startDate = localDateTime.toLocalDate();
        LocalDate endDate = LocalDate.of(2030, 10, 10);

        Period period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());

        LocalTime startTime = localDateTime.toLocalTime();
        LocalTime endTime = LocalTime.of(20, 56, 45);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);

        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());

        Duration duration1 = Duration.between(localDateTime, localDateTime1);
        System.out.println(duration1.toDays());
    }
}
