package com.itheima.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * 请从控制台分别接收两个“生日”，格式为：yyyy年MM月dd日，用程序比较两个生日表示的人的年龄大小关系并打印出结果;
 * <p>
 * 要求:
 * <p>
 * 1:使用Date+SimpleDateFormat完成一遍,
 * <p>
 * 2:再使用LocalDate+DateTimeFormatter+Period完成一遍;
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
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        try {
            Date bir1Date = format.parse(bir1);
            Date bir2Date = format.parse(bir2);

            if (bir1Date.getTime() < bir2Date.getTime()) {
                System.out.println("bir1大");
            } else if (bir1Date.getTime() > bir2Date.getTime()) {
                System.out.println("bir2大");
            } else {
                System.out.println("一样大");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void two(String bir1, String bir2) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        LocalDate birDate1 = LocalDate.parse(bir1, pattern);
        LocalDate birDate2 = LocalDate.parse(bir2, pattern);

        Period betDate = Period.between(birDate1, birDate2);
        if (betDate.getYears() > 0) {
            System.out.println("bir1大");
        } else if (betDate.getYears() < 0) {
            System.out.println("bir大");
        } else {
            System.out.println("一样大");
        }
    }
}
