package com.itheima.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * ���ڿ���̨�ԡ�xxxx��xx��xx�� xxʱxx��xx�롱�ĸ�ʽ��ӡ��ǰϵͳʱ�䡣
 * <p>
 * Ҫ��:
 * <p>
 * 1:ʹ��Date+SimpleDateFormat���һ��,
 * <p>
 * 2:��ʹ��LocalDateTime+DateTimeFormatter���һ��;
 */
public class T1 {
    public static void main(String[] args) {
        one();
        two();
    }

    private static void one() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
        System.out.println(format.format(date));
    }

    private static void two() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HHʱmm��ss��");

        System.out.println(now.format(pattern));
    }
}
