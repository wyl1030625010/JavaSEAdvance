package com.itheima.class_code;

import java.util.Arrays;

public class Demo07_IntergerPractice {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";
        String[] strArr = str.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(intArr));
    }
}
