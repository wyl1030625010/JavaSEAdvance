package com.itheima.homework;

public class T3 {
    public static void main(String[] args) {
        fun(new Cat());//�����������ʽ����
        fun(new Animal() {
            @Override
            public void show() {
                System.out.println("è");
            }
        });//���������ڲ������ʽ����
    }


    public static void fun(Animal a) {
        a.show();
    }
}


interface Animal {
    public void show();
}

class Cat implements Animal {
    @Override
    public void show() {
        System.out.println("è");
    }

}

