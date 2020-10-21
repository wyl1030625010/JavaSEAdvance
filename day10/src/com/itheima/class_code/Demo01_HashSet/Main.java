package com.itheima.class_code.Demo01_HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student(111, "����", 23);
        Student stu2 = new Student(112, "����", 24);
        Student stu3 = new Student(113, "����", 25);
        Student stu4 = new Student(114, "����", 26);
        Student stu5 = new Student(113, "����", 27);

        HashSet<Student> hs = new HashSet<>();
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        hs.add(stu4);
        hs.add(stu5);

        for (Student h : hs) {
            System.out.println(h);
        }

    }
}
