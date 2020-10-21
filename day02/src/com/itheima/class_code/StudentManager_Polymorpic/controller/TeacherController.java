package com.itheima.class_code.StudentManager_Polymorpic.controller;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Teacher;

import java.util.Scanner;

public class TeacherController extends BaseTeacherController {
    Scanner sc = new Scanner(System.in);

    @Override
    public Teacher input(Integer id) {
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        Integer age = sc.nextInt();
        System.out.print("请输入生日：");
        String birthday = sc.next();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);

        return teacher;
    }
}
