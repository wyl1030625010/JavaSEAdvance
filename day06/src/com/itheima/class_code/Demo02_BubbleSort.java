package com.itheima.class_code;

import java.util.Arrays;

public class Demo02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 6, 8, 9, 1, 5};

        int[] newArr = bubbleSort(arr);
        System.out.println(Arrays.toString(newArr));

        int i = Arrays.binarySearch(arr, 8);
        System.out.println(i);
    }

    //√∞≈›≈≈–Ú
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++;
            }
            System.out.println(count);
        }

        return arr;
    }
}
