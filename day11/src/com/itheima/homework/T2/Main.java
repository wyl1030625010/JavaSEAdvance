package com.itheima.homework.T2;

import java.util.ArrayList;
import java.util.Random;

/**
 * �������10��10��20֮��������(���������ظ�),ʹ��Stream���ļ���,�ҳ�����15��Ԫ�ز���ӡ����;
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(11) + 10);
        }

        System.out.println(list);

        list.stream().filter(num -> num > 15).forEach(System.out::println);
    }
}
