package com.itheima.class_code;

import java.util.Arrays;

public class Demo02_System {
    public static void main(String[] args) {

        int[] arr2 = new int[10];

        //һ�������ʽ�����ǰϵͳʱ��
        long l = System.currentTimeMillis();
        System.out.println(l);

        //���鿽�� arrycopy(�����������飬�ӵڼ���������ʼ������ճ�����ĸ����飬�ӵڼ���������ʼճ����ճ�����ٸ���)
        System.arraycopy(new int[]{1, 2, 3, 4, 5, 6}, 0, arr2, 1, 6);

        System.out.println(Arrays.toString(arr2));

        //�رս��� status�����������ʱ���쳣�ر�
        System.exit(0);
    }
}
