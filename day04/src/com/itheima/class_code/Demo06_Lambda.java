package com.itheima.class_code;

public class Demo06_Lambda {
    public static void main(String[] args) {
        useCalculator((int a, int b) -> {
            return a + b;
        });
    }

    public static void useCalculator(Calculator cal) {
        int cal1 = cal.cal(1, 2);
        System.out.println(cal1);
    }
}

interface Calculator {
    int cal(int a, int b);
}

