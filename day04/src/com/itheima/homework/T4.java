package com.itheima.homework;

/**
 * ����һ������ Director�ӿڣ��ں�Ψһ�ĳ��󷽷�makeMovie�����޲������޷���ֵ����ʹ��lambda���ʽ��Test�в�ȫ������ɵ���,��ӡ����������ĵ�Ӱ����������
 */
public class T4 {
    public static void main(String[] args) {
        //��ʹ��Lambda��ʡ�Ը�ʽ����invokeDirect����,��ӡ����������ĵ�Ӱ����������
        invokeDirect(() -> System.out.println("�����ĵ�Ӱ����"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();

    }
}

interface Director {
    void makeMovie();
}

