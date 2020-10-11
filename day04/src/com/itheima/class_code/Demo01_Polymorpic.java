package com.itheima.class_code;

public class Demo01_Polymorpic {
    public static void main(String[] args) {
        Fu zi = new Zi();

        //成员方法，编译时看父类，运行看右边子类
        zi.eat();

        //成员变量，编译时看父类，运行一九看父类
        System.out.println(zi.a);
    }
}

class Fu {
    int a = 10;

    public void eat() {
        System.out.println("吃大米");
    }
}

class Zi extends Fu {
    int a = 20;

    public void eat() {
        System.out.println("吃面条");
    }
}