package com.itheima.homework;

/**
 * ����һ��������Calculator�ӿڣ��ں����󷽷�calc (����)���书���ǿ��Խ��������ֽ�������������ز�ֵ;
 * <p>
 * ��ֱ�ʹ��Lambda�ı�׼��ʽ��ʡ�Ը�ʽ���� invokeCalc ���������130��120��������㲢���������;
 */
public class T5 {
    public static void main(String[] args) {
        //��ֱ�ʹ��Lambda����׼��ʽ������ʡ�Ը�ʽ������invokeCalc����������130-120�Ľ��
        invokeCalc(130, 120, (int a, int b) -> {

            return a - b;
        });
        //ʡ�Ը�ʽ
        invokeCalc(130, 120, (a, b) -> a - b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("����ǣ�" + result);
    }
}

interface Calculator {
    int calc(int a, int b);
}
