package com.itheima.class_code;

import java.util.ArrayList;

public class Demo02_Genericity {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();

        printList(list1);
        printList(list2);
        printList(list3);
        printList(list4);

        //methed1(list1);0.
        //methed1(list2);
        methed1(list3);
        methed1(list4);

        methed2(list1);
        //methed2(list2);
        //methed2(list3);
        methed2(list4);
    }

    /**
     * ͨ��� ��ʱ�������������� ��-> ���� -> ���� -> ����
     */
    public static void printList(ArrayList<?> list) {

    }

    /**
     * �������ߣ�ֻ����Number��Number����
     */
    public static void methed1(ArrayList<? extends Number> list) {
    }

    /**
     * �������ߣ�ֻ����Number��Number����
     */
    public static void methed2(ArrayList<? super Number> list) {

    }
}
