package com.itheima.code_extends.Demo01.controller;

import com.itheima.code_extends.Demo01.domain.Teacher;

import java.util.Scanner;

public class OtherTeacherController extends BaseTeacherController {
    Scanner sc = new Scanner(System.in);

    /**
     * 用户控制
     */
    public Teacher input(Integer id) {
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        Integer age = sc.nextInt();
        System.out.print("请输入生日：");
        String birthday = sc.next();

        Teacher teacher = new Teacher(id, name, age, birthday);

        return teacher;
    }
}
