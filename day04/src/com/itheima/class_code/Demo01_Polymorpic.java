package com.itheima.class_code;

public class Demo01_Polymorpic {
    public static void main(String[] args) {
        Fu zi = new Zi();

        //��Ա����������ʱ�����࣬���п��ұ�����
        zi.eat();

        //��Ա����������ʱ�����࣬����һ�ſ�����
        System.out.println(zi.a);
    }
}

class Fu {
    int a = 10;

    public void eat() {
        System.out.println("�Դ���");
    }
}

class Zi extends Fu {
    int a = 20;

    public void eat() {
        System.out.println("������");
    }
}