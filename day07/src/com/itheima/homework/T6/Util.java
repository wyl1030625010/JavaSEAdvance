package com.itheima.homework.T6;

import java.util.Scanner;

public class Util {
    public static int getInt() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public static double getDouble() {
        Scanner sc = new Scanner(System.in);

        return sc.nextDouble();
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);

        return sc.next();
    }
}
