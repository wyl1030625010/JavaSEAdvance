package com.itheima.class_code.StudentManager_abstract.controller;

import com.itheima.class_code.StudentManager_abstract.domain.Teacher;
import com.itheima.class_code.StudentManager_abstract.service.TeacherService;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseTeacherController {
    TeacherService teacherService = new TeacherService();
    Scanner sc = new Scanner(System.in);

    /**
     * ��ʦ����ϵͳչʾ
     */
    public final void start() {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("*          ��ӭ������ʦ����ϵͳ          *");
            System.out.println("*             1 �����ʦ                *");
            System.out.println("*             2 ɾ����ʦ                *");
            System.out.println("*             3 �޸���ʦ                *");
            System.out.println("*             4 �鿴��ʦ                *");
            System.out.println("*             5 �˳�ϵͳ                *");
            System.out.println("----------------------------------------");
            System.out.print("������ѡ��");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    delTeacher();
                    break;
                case 3:
                    editTeacher();
                    break;
                case 4:
                    findTeacher();
                    break;
                case 5:
                    System.out.println("�˳���ʦ����ϵͳ����л����ʹ��");
                    return;
                default:
                    System.out.println("�����������������룡");
                    break;
            }
        }
    }

    /**
     * �޸���ʦ
     */
    private void editTeacher() {
        Integer id;
        while (true) {
            System.out.print("������Ҫ�޸ĵ���ʦid��");
            id = sc.nextInt();
            boolean exists = teacherService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("��id�����ڣ����������롣");
            }
        }

        Teacher teacher = input(id);

        teacherService.editTeacher(teacher);
    }

    /**
     * ɾ����ʦ
     */
    private final void delTeacher() {
        Integer id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������Ҫɾ����id��");
            id = sc.nextInt();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("��id�����ڣ������������롣");
            } else {
                break;
            }
        }
        teacherService.delTeacher(id);
    }

    /**
     * �鿴������ʦ����
     */
    private void findTeacher() {
        ArrayList<Teacher> allTeacher = TeacherService.findAllTeacher();
        if (allTeacher.size() == 0) {
            System.out.println("������ʦ�����������ʦ");
        } else {
            System.out.println("����\t����\t����\t����");
            for (int i = 0; i < allTeacher.size(); i++) {
                System.out.println(allTeacher.get(i).toString());
            }
        }
    }

    /**
     * �����ʦ����
     */
    private void addTeacher() {
        Integer id;
        while (true) {
            System.out.print("�����빤�ţ�");
            id = sc.nextInt();
            boolean flag = teacherService.isExists(id);
            if (flag) {
                System.out.println("�ù����Ѵ��ڣ�");
            } else {
                break;
            }
        }

        Teacher teacher = input(id);

        teacherService.addTeacher(teacher);
    }

    /**
     * �û�����
     */
    public abstract Teacher input(Integer id);

}
