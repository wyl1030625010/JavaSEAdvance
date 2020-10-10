package com.itheima.domain;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String birthday;

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + age + "\t" + birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Student(Integer id, String name, Integer age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Student() {
    }
}
