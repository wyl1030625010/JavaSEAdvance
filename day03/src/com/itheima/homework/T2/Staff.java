package com.itheima.homework.T2;

import java.util.Scanner;

public class Staff extends Person {

    @Override
    public void body() {
        Scanner sc = new Scanner(System.in);
        System.out.println("������֪ͨ���ݣ�");
        String writ = sc.next();
        System.out.println(writ);
    }
}
