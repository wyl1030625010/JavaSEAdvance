package com.itheima.homework.T1;

import java.util.Scanner;

/**
 * 定义一个方法,可以求出任意个整数的和.然后在主方法中调用.
 * <p>
 * **要求:**
 * <p>
 * 调用方法的时候,实参随便写就行,本题重点考察的是自定义方法的形参设计;
 */

public class Main {
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5, 6);
    }

    public static void sum(Integer... intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        System.out.println(intArr.length + "个整数的和是：" + sum);
    }
}