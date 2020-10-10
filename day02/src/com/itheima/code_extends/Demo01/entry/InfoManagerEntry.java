package com.itheima.code_extends.Demo01.entry;

import com.itheima.code_extends.Demo01.controller.OtherStudentController;
import com.itheima.code_extends.Demo01.controller.OtherTeacherController;
import com.itheima.code_extends.Demo01.controller.TeacherController;

import java.util.Scanner;

/**
 * InfoManagerEntry�������
 */
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
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
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                    break;
                case 2:
                    OtherTeacherController teacherController = new OtherTeacherController();
                    teacherController.start();
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