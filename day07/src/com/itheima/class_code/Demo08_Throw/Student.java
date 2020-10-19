package com.itheima.class_code.Demo08_Throw;

public class Student {
    private String id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String id, String name, Integer age) {
        this.id = id;
        this.name = name;

        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            throw new AgeOutOfBoundExpection(age + " 不符合大于0小于150的规范");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            throw new AgeOutOfBoundExpection("年龄不符合规范");
        }

    }
}
