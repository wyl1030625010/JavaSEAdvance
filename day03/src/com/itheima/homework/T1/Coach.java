package com.itheima.homework.T1;

public class Coach extends Person {
    @Override
    public void eat() {
        System.out.println("�Թ����͡�");
    }

    public Coach() {
    }

    public Coach(String id, String name, String sex, Integer age) {
        super(id, name, sex, age);
    }

}
