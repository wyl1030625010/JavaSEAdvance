package com.itheima.entry;

import com.itheima.controller.StudentController;

import java.util.Scanner;

/**
 * InfoManagerEntry�������
 */
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //���˵�
            System.out.println("----------------------------------------");
            System.out.println("*          ��ӭ�����������ϵͳ          *");
            System.out.println("*             1 ѧ������                *");
            System.out.println("*             2 ��ʦ����                *");
            System.out.println("*             3 �˳�ϵͳ                *");
            System.out.println("----------------------------------------");
            System.out.print("������ѡ��");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    //����start��������ѧ������ϵͳ
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("�˳�����ϵͳ����л����ʹ�á�");
                    System.exit(0);//�Ƴ������
                default:
                    System.out.println("�����������������룡");
                    break;
            }
        }
    }
}