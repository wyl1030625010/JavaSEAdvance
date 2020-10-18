package com.itheima.homework.T1;

import java.util.Arrays;

/**
 * int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
 * 1:使用Arrays对数组元素进行排序并打印排序后的结果；
 * 2:使用二分法查找元素：2，并打印查询结果；
 * 3:使用二分法查找200，并打印查找结果；
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
