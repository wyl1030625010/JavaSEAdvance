package com.itheima.homework.T1;

/**
 * ���̽����������㣺
 * �����3��5����
 * �����3.2����ȡ���Ľ��
 * �����3.8����ȡ���Ľ��
 * �����5.6��������ȡ���Ľ��
 */
public class Main {
    public static void main(String[] args) {
        //�����3��5����
        double pow = Math.pow(3, 5);
        System.out.println(pow);

        //�����3.2����ȡ���Ľ��
        double ceil = Math.ceil(3.2);
        System.out.println(ceil);

        //�����3.8����ȡ���Ľ��
        double floor = Math.floor(3.8);
        System.out.println(floor);

        //�����5.6��������ȡ���Ľ��
        long round = Math.round(5.6);
        System.out.println(round);
    }
}
