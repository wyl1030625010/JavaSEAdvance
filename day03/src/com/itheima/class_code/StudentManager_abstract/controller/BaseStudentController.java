package com.itheima.class_code.StudentManager_abstract.controller;

import com.itheima.class_code.StudentManager_abstract.domain.Student;
import com.itheima.class_code.StudentManager_abstract.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseStudentController {
    StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);

    /**
     * 学生管理系统展示
     */
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("*          欢迎来到学生管理系统          *");
            System.out.println("*             1 添加学生                *");
            System.out.println("*             2 删除学生                *");
            System.out.println("*             3 修改学生                *");
            System.out.println("*             4 查看学生                *");
            System.out.println("*             5 退出系统                *");
            System.out.println("----------------------------------------");
            System.out.print("请输入选择：");

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
                    System.out.println("退出学生管理系统，感谢您的使用");
                    return;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }

    /**
     * 修改学生
     */
    private void editStudent() {
        Scanner sc = new Scanner(System.in);
        Integer id;
        while (true) {
            System.out.print("请输入要修改的学生id：");
            id = sc.nextInt();
            boolean exists = studentService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("该id不存在，请重新输入。");
            }
        }

        Student student = input(id);

        studentService.editStudent(student);
    }

    /**
     * 删除学生
     */
    private void delStudent() {
        Integer id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入要删除的id：");
            id = sc.nextInt();
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("该id不存在，请重新能输入。");
            } else {
                break;
            }
        }
        studentService.delStudent(id);
    }

    /**
     * 查看所有学生操作
     */
    private void findStudent() {
        ArrayList<Student> allStudent = studentService.findAllStudent();

        if (allStudent.size() == 0) {
            System.out.println("暂无学生，请先添加学生");
        } else {
            System.out.println("学号\t姓名\t年龄\t生日");
            for (int i = 0; i < allStudent.size(); i++) {
                System.out.println(allStudent.get(i).toString());
            }
        }
    }

    /**
     * 添加学生操作
     */
    private void addStudent() {
        Integer id;
        while (true) {
            System.out.print("请输入学号：");
            id = sc.nextInt();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("该学号已存在！");
            } else {
                break;
            }
        }

        Student student = input(id);

        studentService.addStudent(student);
    }

    /**
     * 用户输入操作，该方法会被子类重写
     *
     */
    public Student input(Integer id) {
        return null;
    }
}
