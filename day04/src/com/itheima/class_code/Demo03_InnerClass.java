package com.itheima.class_code;


public class Demo03_InnerClass {
    public static void main(String[] args) {
        /*
        �����ڲ���
        ������CatInter��������౾��û������
        ������󱻱��浽����cat��
         */
        CatInter cat = new CatInter() {
            @Override
            public void eat() {
                System.out.println("è����");
            }
        };

        cat.eat();
    }
}

interface CatInter {
    void eat();
}