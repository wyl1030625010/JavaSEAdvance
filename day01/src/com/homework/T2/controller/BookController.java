package com.homework.T2.controller;

import java.util.Scanner;

public class BookController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------��ӭ����ͼ�����ϵͳ-------");
            System.out.println("����������1.����ͼ�� 2.ɾ��ͼ�� 3.�޸�ͼ�� 4.�鿴ͼ�� 5.�˳�ϵͳ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("����ͼ��...");
                    break;
                case 2:
                    System.out.println("ɾ��ͼ��...");
                    break;
                case 3:
                    System.out.println("�޸�ͼ��...");
                    break;
                case 4:
                    System.out.println("�鿴ͼ��...");
                    break;
                case 5:
                    System.out.println("��л����ʹ��");
                    return;
                default:
                    System.out.println("��������");

            }
        }
    }
}
