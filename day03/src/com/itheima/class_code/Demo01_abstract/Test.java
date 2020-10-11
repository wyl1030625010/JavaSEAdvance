package com.itheima.class_code.Demo01_abstract;

public class Test {
    /*
        1.抽象类不能实例化
        2.抽象类存在构造方法
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
