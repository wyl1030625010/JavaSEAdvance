package com.itheima.homework;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * �����롰�������ա�����ʽ��yyyy-MM-dd��ʹ�ó���������Ѿ������������������ˡ�
 */
public class T2 {
    public static void main(String[] args) {
        String birthday = "1996-10-14";

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate birDate = LocalDate.parse(birthday, pattern);
        LocalDateTime birDateTime = LocalDateTime.of(birDate, LocalTime.of(0, 0, 0));
        LocalDateTime nowDate = LocalDateTime.now();

        Duration betDate = Duration.between(birDateTime, nowDate);
        System.out.println("�һ���" + betDate.toDays() + "��");
    }
}
