package com.itheima.homework.T4;

import java.util.Scanner;

/**
 * 在一行中通过键盘输入自己的年龄和身高(要带小数),年龄和身高中间使用逗号分隔,请利用今天的技术和字符串的切分方法,将键盘输入的数据转成整数和小数;
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] split = str.split(",");

        for (String s : split) {
            System.out.print(s + " ");
        }
    }
}
