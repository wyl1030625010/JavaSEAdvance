package com.itheima.homework.T4;

import java.util.Scanner;

/**
 * ��һ����ͨ�����������Լ�����������(Ҫ��С��),���������м�ʹ�ö��ŷָ�,�����ý���ļ������ַ������зַ���,���������������ת��������С��;
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] split = str.split(",");

        for (String s : split) {
            System.out.print(s + " ");
        }
    }
}
