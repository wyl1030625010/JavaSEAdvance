package com.itheima.homework.T2;

import java.util.Scanner;

public class Manager extends Person {

    private Double year_end_bonus;

    @Override
    public void body() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入通知内容：");
        String writ = sc.next();
        System.out.println(writ);
    }
}
