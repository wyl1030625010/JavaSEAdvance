package com.itheima.homework;

public class T3 {
    public static void main(String[] args) {
        fun(new Cat());//请用子类的形式调用
        fun(new Animal() {
            @Override
            public void show() {
                System.out.println("猫");
            }
        });//请用匿名内部类的形式调用
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
        System.out.println("猫");
    }

}

