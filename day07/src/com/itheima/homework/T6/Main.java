package com.itheima.homework.T6;

import java.util.InputMismatchException;

/**
 * �Զ���һ����������Ĺ�����,�ṩ3����̬����,�ֱ�������û���������,С��,���ַ����Ĺ���,�ҵ��û���������ʱ��,���ܽ�������,Ҫ���û���������Ļ���;
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Util.getInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("������������������");
            }
        }

        while (true) {
            try {
                Util.getDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("��������������С��");
            }
        }

        while (true) {
            try {
                Util.getString();
                break;
            } catch (InputMismatchException e) {
                System.out.println("���������������ַ���");
            }
        }
    }
}
