package com.itheima.class_code.Demo01_abstract;

public class Test {
    /*
        1.�����಻��ʵ����
        2.��������ڹ��췽��
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.drink();

        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.drink();
    }
}
