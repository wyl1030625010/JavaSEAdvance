package com.itheima.class_code;

import java.util.TreeSet;

public class Demo04_StudentTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("010", "zhangsan", 18));
        treeSet.add(new Student("011", "lsii", 17));
        treeSet.add(new Student("017", "wangwu", 20));
        treeSet.add(new Student("014", "zhaoliu", 18));
        treeSet.add(new Student("020", "tianqi", 13));

        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
