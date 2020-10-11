package com.itheima.homework.T1;

public class Athlete extends Person {
    private String address;

    @Override
    public void eat() {
        System.out.println("³ÔÓªÑø²Í¡£");
    }

    public Athlete() {
    }

    public Athlete(String id, String name, String sex, Integer age, String address) {
        super(id, name, sex, age);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
