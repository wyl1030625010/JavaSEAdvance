package com.itheima.class_code.StudentManager_Polymorpic.controller;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController {
    Scanner sc = new Scanner(System.in);

    /**
     * �û�����
     */
    @Override
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
