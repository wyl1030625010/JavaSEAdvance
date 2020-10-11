package com.itheima.homework.T2;

public abstract class Person {
    private String id;
    private String name;
    private Integer age;

    public void behavior() {
        System.out.println("通知：");
        body();
        System.out.println("\t\t\t\t\t\t必胜环球科技有限公司");
    }

    public abstract void body();
}
