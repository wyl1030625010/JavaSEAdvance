package com.itheima.code_extends.Demo01.controller;

import com.itheima.code_extends.Demo01.domain.Teacher;

import java.util.Scanner;

public class OtherTeacherController extends BaseTeacherController {
    Scanner sc = new Scanner(System.in);

    /**
     * �û�����
     */
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
