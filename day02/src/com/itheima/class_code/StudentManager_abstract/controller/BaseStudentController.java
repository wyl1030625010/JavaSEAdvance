package com.itheima.class_code.StudentManager_abstract.controller;

import com.itheima.class_code.StudentManager_abstract.domain.Student;
import com.itheima.class_code.StudentManager_abstract.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseStudentController {
    StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);

    /**
     * ѧ������ϵͳչʾ
     */
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("*          ��ӭ����ѧ������ϵͳ          *");
            System.out.println("*             1 ���ѧ��                *");
            System.out.println("*             2 ɾ��ѧ��                *");
            System.out.println("*             3 �޸�ѧ��                *");
            System.out.println("*             4 �鿴ѧ��                *");
            System.out.println("*             5 �˳�ϵͳ                *");
            System.out.println("----------------------------------------");
            System.out.print("������ѡ��");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    delStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    findStudent();
                    break;
                case 5:
                    System.out.println("�˳�ѧ������ϵͳ����л����ʹ��");
                    return;
                default:
                    System.out.println("�����������������룡");
                    break;
            }
        }
    }

    /**
     * �޸�ѧ��
     */
    private void editStudent() {
        Scanner sc = new Scanner(System.in);
        Integer id;
        while (true) {
            System.out.print("������Ҫ�޸ĵ�ѧ��id��");
            id = sc.nextInt();
            boolean exists = studentService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("��id�����ڣ����������롣");
            }
        }

        Student student = input(id);

        studentService.editStudent(student);
    }

    /**
     * ɾ��ѧ��
     */
    private void delStudent() {
        Integer id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������Ҫɾ����id��");
            id = sc.nextInt();
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("��id�����ڣ������������롣");
            } else {
                break;
            }
        }
        studentService.delStudent(id);
    }

    /**
     * �鿴����ѧ������
     */
    private void findStudent() {
        ArrayList<Student> allStudent = studentService.findAllStudent();

        if (allStudent.size() == 0) {
            System.out.println("����ѧ�����������ѧ��");
        } else {
            System.out.println("ѧ��\t����\t����\t����");
            for (int i = 0; i < allStudent.size(); i++) {
                System.out.println(allStudent.get(i).toString());
            }
        }
    }

    /**
     * ���ѧ������
     */
    private void addStudent() {
        Integer id;
        while (true) {
            System.out.print("������ѧ�ţ�");
            id = sc.nextInt();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("��ѧ���Ѵ��ڣ�");
            } else {
                break;
            }
        }

        Student student = input(id);

        studentService.addStudent(student);
    }

    /**
     * �û�����������÷����ᱻ������д
     *
     */
    public Student input(Integer id) {
        return null;
    }
}
