package com.itheima.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * ��ӿ���̨�ֱ�������������ա�����ʽΪ��yyyy��MM��dd�գ��ó���Ƚ��������ձ�ʾ���˵������С��ϵ����ӡ�����;
 * <p>
 * Ҫ��:
 * <p>
 * 1:ʹ��Date+SimpleDateFormat���һ��,
 * <p>
 * 2:��ʹ��LocalDate+DateTimeFormatter+Period���һ��;
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bir1 = sc.nextLine();
        String bir2 = sc.nextLine();

        one(bir1, bir2);
        two(bir1, bir2);
    }

    private static void one(String bir1, String bir2) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd��");
        try {
            Date bir1Date = format.parse(bir1);
            Date bir2Date = format.parse(bir2);

            if (bir1Date.getTime() < bir2Date.getTime()) {
                System.out.println("bir1��");
            } else if (bir1Date.getTime() > bir2Date.getTime()) {
                System.out.println("bir2��");
            } else {
                System.out.println("һ����");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void two(String bir1, String bir2) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy��MM��dd��");

        LocalDate birDate1 = LocalDate.parse(bir1, pattern);
        LocalDate birDate2 = LocalDate.parse(bir2, pattern);

        Period betDate = Period.between(birDate1, birDate2);
        if (betDate.getYears() > 0) {
            System.out.println("bir1��");
        } else if (betDate.getYears() < 0) {
            System.out.println("bir��");
        } else {
            System.out.println("һ����");
        }
    }
}
