package com.itheima.class_code;

public class Demo01_Math {
    public static void main(String[] args) {
        //����ֵ
        int abs = Math.abs(-10);
        System.out.println(abs);

        //����ȡ��
        double ceil = Math.ceil(10.1);
        System.out.println(ceil);

        //����ȡ��
        double floor = Math.floor(10.1);
        System.out.println(floor);

        //���ֵ
        int max = Math.max(10, 20);
        System.out.println(max);

        //��Сֵ
        int min = Math.min(10, 20);
        System.out.println(min);

        //������
        double pow = Math.pow(2, 3);
        System.out.println(pow);

        //��������
        long round = Math.round(10.4);
        long round1 = Math.round(10.5);
        System.out.println(round);
        System.out.println(round1);

        //����� [0.0,1.0)
        double random = Math.random();
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "��" + random);
        }

        double v = Math.copySign(1.1, -2.2);
        System.out.println(v);

        double hypot = Math.hypot(3, 4);
        System.out.println(hypot);
    }
}
