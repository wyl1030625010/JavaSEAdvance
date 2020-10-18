package com.itheima.homework.T2;

/**
 * 请使用递归计算从1到100之间的所有数之和。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(100));
    }

    private static int recursion(int i) {
        int sum;

        if (i == 1) {
            return 1;
        }

        sum = i + recursion(i - 1);

        return sum;
    }
}
