package com.itheima.homework.T4.Controller;

import com.itheima.homework.T4.Service.RandomService;

import java.util.Scanner;

public class RandomController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("�Ƿ�������������(yes/no)");
            String input = sc.next();

            switch (input) {
                case "yes":
                    random();
                    break;
                case "no":
                    System.out.println("ллʹ��");
                    return;
                default:
                    System.out.println("��������");
                    break;
            }
        }
    }

    public void random() {
        RandomService randomService = new RandomService();
        randomService.random();
    }
}
