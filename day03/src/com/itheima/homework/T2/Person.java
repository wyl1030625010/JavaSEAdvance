package com.itheima.homework.T2;

public abstract class Person {
    private String id;
    private String name;
    private Integer age;

    public void behavior() {
        String body = body();
        System.out.println("编号为" + id + "年龄为" + age + "的" + name + "发布了通知。");
        System.out.println("通知：");
        System.out.println(body);
        System.out.println("\t\t\t\t\t\t必胜环球科技有限公司");
    }

    public abstract String body();

    public Person() {
    }

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
        this.age = age;
    }
}
