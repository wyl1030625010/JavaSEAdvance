package com.itheima.class_code;

import java.util.Arrays;

public class Demo05_QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (right < left) {
            return;
        }

        int left0 = left;
        int right0 = right;
        int baseNum = arr[left0];

        //3.��ɫ���������ң���ɫ���������ң�֪��������ͷָ��ͬһ������λ��
        while (left != right) {
            //1.���ҿ�ʼ�ұȻ�׼��С��
            while (arr[right] >= baseNum && right > left) {
                right--;
            }

            //2.����ʼ�ұȻ�׼�����
            while (arr[left] <= baseNum && right > left) {
                left++;
            }

            //3.��������ֵ��λ��
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }

        //5.��׼����λ
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        quickSort(arr, left0, left - 1);
        quickSort(arr, left + 1, right0);
    }
}
