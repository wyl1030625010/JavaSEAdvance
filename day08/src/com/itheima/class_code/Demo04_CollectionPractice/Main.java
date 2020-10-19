package com.itheima.class_code.Demo04_CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Student> collection = new ArrayList<>();

        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 33);
        Student stu3 = new Student("王五", 43);

        collection.add(stu1);
        collection.add(stu2);
        collection.add(stu3);

        //迭代器
        iterator(collection);

        //增强for
        foreach(collection);
    }

    private static void foreach(Collection<Student> collection) {
        for (Student stu : collection) {
            System.out.println(stu);
        }
    }

    private static void iterator(Collection<Student> collection) {
        Iterator<Student> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
