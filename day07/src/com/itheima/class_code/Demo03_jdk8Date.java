package com.itheima.class_code;

import java.time.LocalDateTime;

public class Demo03_jdk8Date {
    public static void main(String[] args) {
        LocalDateTime of = LocalDateTime.of(2020, 10, 17, 11, 11, 11, 11);

        System.out.println("��Ϊ��" + of.getYear());

        System.out.println("��Ϊ��" + of.getMonthValue());

        System.out.println("��������Ϊ��" + of.getDayOfMonth());

        System.out.println("�����еļ�����Ϊ��" + of.getDayOfYear());

        System.out.println("����Ϊ��" + of.getDayOfWeek());

        System.out.println("СʱΪ��" + of.getHour());

        System.out.println("����Ϊ��" + of.getMinute());

        System.out.println("����Ϊ��" + of.getSecond());

        System.out.println("����Ϊ��" + of.getNano());

        System.out.println(of.toLocalDate());

        System.out.println(of.toLocalTime());

        System.out.println(of.toString());
    }
}
