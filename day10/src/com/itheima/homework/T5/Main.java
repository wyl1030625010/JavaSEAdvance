package com.itheima.homework.T5;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * 编写Java程序，模拟学生信息管理系统。有多个班级，每个班级中有多位学员，
 * 创建班级和学员，存入合适的集合中，实现班级排序和每个班级中学员按学号排序
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("王五", 61));
        students.add(new Student("张三", 85));
        students.add(new Student("李四", 90));

        TreeSet<Grade> grades = new TreeSet<>();
        grades.add(new Grade(1, "java1班"));
        grades.add(new Grade(2, "java2班"));
        grades.add(new Grade(3, "java3班"));

        HashMap<TreeSet<Grade>, TreeSet<Student>> treeMap = new HashMap<>();

        treeMap.put(grades, students);

        treeMap.forEach((key, value) -> {
            key.forEach(grade -> {
                System.out.println(grade + "学生为：");
                value.forEach(student -> {
                    //System.out.println(student);
                    System.out.println(student);
                });
                System.out.println();
            });
        });
    }
}
