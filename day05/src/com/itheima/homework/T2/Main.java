package com.itheima.homework.T2;

import java.util.ArrayList;

/**
 * �붨��һ������,����1��1ǧ����1ǧ���������ӵ������У����������Ϊ���е�ʱ�䣬����ӡ��
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
