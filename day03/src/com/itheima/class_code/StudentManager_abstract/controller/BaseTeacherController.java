package com.itheima.class_code.StudentManager_abstract.controller;

import com.itheima.class_code.StudentManager_abstract.domain.Teacher;
import com.itheima.class_code.StudentManager_abstract.service.TeacherService;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseTeacherController {
    TeacherService teacherService = new TeacherService();
    Scanner sc = new Scanner(System.in);

    /**
     * 老师管理系统展示
     */
    public final void start() {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("*          欢迎来到老师管理系统          *");
            System.out.println("*             1 添加老师                *");
            System.out.println("*             2 删除老师                *");
            System.out.println("*             3 修改老师                *");
            System.out.println("*             4 查看老师                *");
            System.out.println("*             5 退出系统                *");
            System.out.println("----------------------------------------");
            System.out.print("请输入选择：");

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
                    System.out.println("退出老师管理系统，感谢您的使用");
                    return;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }

    /**
     * 修改老师
     */
    private void editTeacher() {
        Integer id;
        while (true) {
            System.out.print("请输入要修改的老师id：");
            id = sc.nextInt();
            boolean exists = teacherService.isExists(id);
            if (exists) {
                break;
            } else {
                System.out.println("该id不存在，请重新输入。");
            }
        }

        Teacher teacher = input(id);

        teacherService.editTeacher(teacher);
    }

    /**
     * 删除老师
     */
    private final void delTeacher() {
        Integer id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入要删除的id：");
            id = sc.nextInt();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("该id不存在，请重新能输入。");
            } else {
                break;
            }
        }
        teacherService.delTeacher(id);
    }

    /**
     * 查看所有老师操作
     */
    private void findTeacher() {
        ArrayList<Teacher> allTeacher = TeacherService.findAllTeacher();
        if (allTeacher.size() == 0) {
            System.out.println("暂无老师，请先添加老师");
        } else {
            System.out.println("工号\t姓名\t年龄\t生日");
            for (int i = 0; i < allTeacher.size(); i++) {
                System.out.println(allTeacher.get(i).toString());
            }
        }
    }

    /**
     * 添加老师操作
     */
    private void addTeacher() {
        Integer id;
        while (true) {
            System.out.print("请输入工号：");
            id = sc.nextInt();
            boolean flag = teacherService.isExists(id);
            if (flag) {
                System.out.println("该工号已存在！");
            } else {
                break;
            }
        }

        Teacher teacher = input(id);

        teacherService.addTeacher(teacher);
    }

    /**
     * 用户输入
     */
    public abstract Teacher input(Integer id);

}
