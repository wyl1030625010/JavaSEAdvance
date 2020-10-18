package com.itheima.class_code;

public class Demo07_Throw {
    public static void main(String[] args) {
        int[] arr = null;

        try {
            print(arr);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            System.out.println(message);
            e.printStackTrace();
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
