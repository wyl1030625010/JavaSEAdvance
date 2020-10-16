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

        //3.红色继续往左找，蓝色继续往右找，知道两个箭头指向同一个索引位置
        while (left != right) {
            //1.从右开始找比基准数小的
            while (arr[right] >= baseNum && right > left) {
                right--;
            }

            //2.从左开始找比基准数大的
            while (arr[left] <= baseNum && right > left) {
                left++;
            }

            //3.交换两个值的位置
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }

        //5.基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        quickSort(arr, left0, left - 1);
        quickSort(arr, left + 1, right0);
    }
}
