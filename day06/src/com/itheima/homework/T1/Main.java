package com.itheima.homework.T1;

import java.util.Arrays;

/**
 * int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
 * 1:ʹ��Arrays������Ԫ�ؽ������򲢴�ӡ�����Ľ����
 * 2:ʹ�ö��ַ�����Ԫ�أ�2������ӡ��ѯ�����
 * 3:ʹ�ö��ַ�����200������ӡ���ҽ����
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {431, 54, 25, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7, 54};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int num = Arrays.binarySearch(arr, 200);
        System.out.println(num);
    }
}
