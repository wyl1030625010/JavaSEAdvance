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

            @Override
            public void drink() {
                System.out.println("è��ˮ");
            }
        };

        cat.eat();
        cat.drink();
    }
}

interface CatInter {
    void eat();

    void drink();
}