package com.itheima.homework;

import java.util.Random;
import java.util.TreeSet;

/**
 * �������8�����ظ���10��20֮��������������Set������,Ȼ���ӡ�����������е�����;
 * <p>
 * **Ҫ��:**
 * <p>
 * ʹ��TreeSet����ʵ��;
 */
public class T2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int randomNum = random.nextInt(11) + 10;
            ts.add(randomNum);
            System.out.println("��" + (i + 1) + "�����ɵ��������" + randomNum);
        }

        System.out.println(ts);
    }
}
