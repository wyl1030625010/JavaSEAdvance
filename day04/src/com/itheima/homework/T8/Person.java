package com.itheima.homework.T8;

public class Person {
    private String name;
    private Integer hight;

    public Person() {
    }

    public Person(String name, Integer hight) {
        this.name = name;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }
}
