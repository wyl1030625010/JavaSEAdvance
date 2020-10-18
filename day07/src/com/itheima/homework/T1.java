package com.itheima.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
 * <p>
 * 要求:
 * <p>
 * 1:使用Date+SimpleDateFormat完成一遍,
 * <p>
 * 2:再使用LocalDateTime+DateTimeFormatter完成一遍;
 */
public class T1 {
    public static void main(String[] args) {
        one();
        two();
    }

    private static void one() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(format.format(date));
    }

    private static void two() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

        System.out.println(now.format(pattern));
    }
}
