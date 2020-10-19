package com.itheima.homework.T4.DAO;


import com.itheima.homework.T4.domain.Student;

import java.util.LinkedList;
import java.util.Random;

public class RandomDAO {
    private static LinkedList<Student> lindedList = new LinkedList<>();

    static {
        lindedList.add(new Student(010, "����"));
        lindedList.add(new Student(011, "����"));
        lindedList.add(new Student(012, "����"));
        lindedList.add(new Student(013, "����"));
    }

    public Student random() {
        Random random = new Random();
        int randomNum = random.nextInt(lindedList.size());
        Student student = lindedList.get(randomNum);

        lindedList.remove(student);
        lindedList.addLast(student);

        return student;
    }
}
