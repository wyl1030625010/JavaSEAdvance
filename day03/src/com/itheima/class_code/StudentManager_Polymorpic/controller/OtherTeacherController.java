package com.itheima.class_code.StudentManager_Polymorpic.controller;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Teacher;

import java.util.Scanner;

public class OtherTeacherController extends BaseTeacherController {
    Scanner sc = new Scanner(System.in);

    /**
     * �û�����
     */
    @Override
    public Teacher input(Integer id) {
        System.out.print("������������");
        String name = sc.next();
        System.out.print("���������䣺");
        Integer age = sc.nextInt();
        System.out.print("���������գ�");
        String birthday = sc.next();

        Teacher teacher = new Teacher(id, name, age, birthday);

        return teacher;
    }
}
