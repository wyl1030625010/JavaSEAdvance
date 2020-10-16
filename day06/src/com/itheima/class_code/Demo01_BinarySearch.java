package com.itheima.class_code;

public class Demo01_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 11;

        int index = binarySearch(arr, num);
        if (-1 != index) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }

    /**
     * ¶ş·Ö²éÕÒ
     */
    public static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) >> 1;
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
