package com.homework.T2.controller;

import java.util.Scanner;

public class BookController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------欢迎来到图书管理系统-------");
            System.out.println("请输入先择：1.增加图书 2.删除图书 3.修改图书 4.查看图书 5.退出系统");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("增加图书...");
                    break;
                case 2:
                    System.out.println("删除图书...");
                    break;
                case 3:
                    System.out.println("修改图书...");
                    break;
                case 4:
                    System.out.println("查看图书...");
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    return;
                default:
                    System.out.println("输入有误");

            }
        }
    }
}
