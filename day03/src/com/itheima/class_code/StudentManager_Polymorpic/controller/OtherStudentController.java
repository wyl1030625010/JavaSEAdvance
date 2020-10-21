package com.itheima.class_code.StudentManager_Polymorpic.controller;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController {
    Scanner sc = new Scanner(System.in);

    /**
     * 用户输入
     */
    @Override
    public Student input(Integer id) {
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        Integer age = sc.nextInt();
        System.out.print("请输入生日：");
        String birthday = sc.next();

        Student student = new Student(id, name, age, birthday);

        return student;
    }
}
