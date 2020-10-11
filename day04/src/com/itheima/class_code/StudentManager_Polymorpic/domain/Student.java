package com.itheima.class_code.StudentManager_Polymorpic.domain;

public class Student extends Person {

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String birthday) {
        super(id, name, age, birthday);
    }
}
