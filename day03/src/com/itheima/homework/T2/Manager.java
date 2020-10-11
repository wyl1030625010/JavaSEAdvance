package com.itheima.homework.T2;

import java.util.Scanner;

public class Manager extends Person {

    private Double year_end_bonus;

    @Override
    public String body() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入通知内容：");
        String writ = sc.next();
        System.out.println(writ);
        return writ;
    }

    public Manager() {
    }

    public Manager(String id, String name, Integer age) {
        super(id, name, age);
    }

    public Double getYear_end_bonus() {
        return year_end_bonus;
    }

    public void setYear_end_bonus(Double year_end_bonus) {
        this.year_end_bonus = year_end_bonus;
    }
}
