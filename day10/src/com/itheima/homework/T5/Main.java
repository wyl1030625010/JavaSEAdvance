package com.itheima.homework.T5;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * ��дJava����ģ��ѧ����Ϣ����ϵͳ���ж���༶��ÿ���༶���ж�λѧԱ��
 * �����༶��ѧԱ��������ʵļ����У�ʵ�ְ༶�����ÿ���༶��ѧԱ��ѧ������
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("����", 61));
        students.add(new Student("����", 85));
        students.add(new Student("����", 90));

        TreeSet<Grade> grades = new TreeSet<>();
        grades.add(new Grade(1, "java1��"));
        grades.add(new Grade(2, "java2��"));
        grades.add(new Grade(3, "java3��"));

        HashMap<TreeSet<Grade>, TreeSet<Student>> treeMap = new HashMap<>();

        treeMap.put(grades, students);

        treeMap.forEach((key, value) -> {
            key.forEach(grade -> {
                System.out.println(grade + "ѧ��Ϊ��");
                value.forEach(student -> {
                    //System.out.println(student);
                    System.out.println(student);
                });
                System.out.println();
            });
        });
    }
}
