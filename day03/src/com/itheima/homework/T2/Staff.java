package com.itheima.homework.T2;

import java.util.Scanner;

public class Staff extends Person {

    @Override
    public String body() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入通知内容：");
        return sc.next();
    }

    public Staff() {
    }

    public Staff(String id, String name, Integer age) {
        super(id, name, age);
    }
}
