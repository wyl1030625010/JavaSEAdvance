package com.itheima.class_code.Demo04_TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        map.put(new Student("����", 23), "����");
        map.put(new Student("����", 24), "�ӱ�");
        map.put(new Student("����", 23), "����");
        map.put(new Student("����", 21), "����");

        map.forEach((key, value) -> {
            System.out.println(key + "-------" + value);
        });
    }
}
