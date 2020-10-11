package com.itheima.class_code;

public class Demo02_Polymorpic {
    public static void main(String[] args) {
        eat(new Dog());
        eat(new Cat());
    }

    public static void eat(Animal a) {
        a.eat();

        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            System.out.println(dog == a);
            dog.watchHome();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("π∑≥‘»‚");
    }

    void watchHome() {
        System.out.println("ø¥º“");
    }
}

class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("√®≥‘”„");
    }
}