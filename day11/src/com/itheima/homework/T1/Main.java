package com.itheima.homework.T1;

import java.util.Scanner;

/**
 * ����һ������,�����������������ĺ�.Ȼ�����������е���.
 * <p>
 * **Ҫ��:**
 * <p>
 * ���÷�����ʱ��,ʵ�����д����,�����ص㿼������Զ��巽�����β����;
 */

public class Main {
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5, 6);
    }

    public static void sum(Integer... intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        System.out.println(intArr.length + "�������ĺ��ǣ�" + sum);
    }
}