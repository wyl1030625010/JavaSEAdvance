package com.itheima.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 请从控制台接收两个整数并计算两个数的商,使用程序控制,如果用户输入的不是整数,则提示用户重新输入;
 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        while (true) {
            try {
                num1 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请输入整数。");
                sc = new Scanner(System.in);
            }
        }

        while (true) {
            try {
                num2 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请输入整数。");
                sc = new Scanner(System.in);
            }
        }

        num3 = num1 / num2;

        System.out.println(num3);
    }
}
