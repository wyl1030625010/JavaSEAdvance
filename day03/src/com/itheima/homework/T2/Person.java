package com.itheima.homework.T2;

public abstract class Person {
    private String id;
    private String name;
    private Integer age;

    public void behavior() {
        System.out.println("֪ͨ��");
        body();
        System.out.println("\t\t\t\t\t\t��ʤ����Ƽ����޹�˾");
    }

    public abstract void body();
}
