package com.itheima.homework.T1;

import java.util.Objects;

public class Roomie {
    private String name;
    private Integer age;

    public Roomie() {
    }

    public Roomie(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Roomie{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Roomie roomie = (Roomie) o;
        return Objects.equals(name, roomie.name) &&
                Objects.equals(age, roomie.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
