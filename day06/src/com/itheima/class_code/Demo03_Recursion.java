package com.itheima.class_code;

public class Demo03_Recursion {
    public static void main(String[] args) {

        int sum = getNum(1000);
        System.out.println(sum);
    }

    private static int getNum(int i) {
        int sum;
        if (i == 1) {
            return 1;
        } else {
            sum = i + getNum(i - 1);
        }

        return sum;
    }
}
