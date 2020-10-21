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

        map.put(new Student("张三", 23), "河南");
        map.put(new Student("李四", 24), "河北");
        map.put(new Student("王五", 23), "陕西");
        map.put(new Student("赵六", 21), "重庆");

        map.forEach((key, value) -> {
            System.out.println(key + "-------" + value);
        });
    }
}
