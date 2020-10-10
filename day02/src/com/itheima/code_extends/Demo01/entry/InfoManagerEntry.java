package com.itheima.code_extends.Demo01.entry;

import com.itheima.code_extends.Demo01.controller.OtherStudentController;
import com.itheima.code_extends.Demo01.controller.OtherTeacherController;
import com.itheima.code_extends.Demo01.controller.TeacherController;

import java.util.Scanner;

/**
 * InfoManagerEntry程序入口
 */
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("*          欢迎来到黑马管理系统          *");
            System.out.println("*             1 学生管理                *");
            System.out.println("*             2 教师管理                *");
            System.out.println("*             3 退出系统                *");
            System.out.println("----------------------------------------");
            System.out.print("请输入选择：");

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
                    System.out.println("退出管理系统，感谢您的使用。");
                    System.exit(0);//推出虚拟机
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }
}