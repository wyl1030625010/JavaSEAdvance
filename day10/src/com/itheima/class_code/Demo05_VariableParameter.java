package com.itheima.class_code;

public class Demo05_VariableParameter {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3);
        System.out.println(sum);
    }

    private static int getSum(int... arr) {
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        return sum;
    }
}
