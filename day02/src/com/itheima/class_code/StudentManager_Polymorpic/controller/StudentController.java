package com.itheima.class_code.StudentManager_Polymorpic.controller;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.Scanner;

public class StudentController extends BaseStudentController {
    Scanner sc = new Scanner(System.in);

    /**
     * 用户输入
     */
    public Student input(Integer id) {
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        Integer age = sc.nextInt();
        System.out.print("请输入生日：");
        String birthday = sc.next();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setBirthday(birthday);

        return student;
    }
}
