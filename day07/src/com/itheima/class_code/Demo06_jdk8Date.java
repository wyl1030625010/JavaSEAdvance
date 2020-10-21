package com.itheima.class_code;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo06_jdk8Date {
    public static void main(String[] args) {
        String bitrhday = "1996-10-14 00:00:00";

        //������ʽ����
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //���������ַ���
        LocalDateTime birDateTime = LocalDateTime.parse(bitrhday, pattern);
        //������������ �����������+60
        LocalDateTime backDateTime = birDateTime.plusYears(60);
        System.out.println(backDateTime);

        //��ȡ���������ʱ��
        LocalDateTime nowDateTime = LocalDateTime.now();

        //��ȡ���յ���������ڼ��
        Period age = Period.between(birDateTime.toLocalDate(), nowDateTime.toLocalDate());
        //��ù��˶�����
        System.out.println("����" + age.getYears() + "��");

        //��ȡ���յ������ʱ����
        Duration duration = Duration.between(birDateTime, nowDateTime);
        //���һ�����˶�����
        System.out.println("����" + duration.toDays() + "��");

        //��ȡ���쵽�������ڵ�ʱ����
        Duration back = Duration.between(nowDateTime, backDateTime);
        //��û��������
        System.out.println("����" + back.toDays() + "������");
    }
}
