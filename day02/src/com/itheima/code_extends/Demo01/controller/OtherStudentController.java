package com.itheima.code_extends.Demo01.controller;

import com.itheima.code_extends.Demo01.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController {
    Scanner sc = new Scanner(System.in);

    /**
     * �û�����
     */
    public Student input(Integer id) {
        System.out.print("������������");
        String name = sc.next();
        System.out.print("���������䣺");
        Integer age = sc.nextInt();
        System.out.print("���������գ�");
        String birthday = sc.next();

        Student student = new Student(id, name, age, birthday);

        return student;
    }
}
