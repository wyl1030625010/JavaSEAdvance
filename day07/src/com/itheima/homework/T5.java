package com.itheima.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ��ӿ���̨����������������������������,ʹ�ó������,����û�����Ĳ�������,����ʾ�û���������;
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
                System.out.println("�������������������");
                sc = new Scanner(System.in);
            }
        }

        while (true) {
            try {
                num2 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("�������������������");
                sc = new Scanner(System.in);
            }
        }

        num3 = num1 / num2;

        System.out.println(num3);
    }
}
