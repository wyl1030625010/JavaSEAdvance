package com.itheima.homework.T1;

/**
 * 请编程进行以下运算：
 * 请计算3的5次幂
 * 请计算3.2向上取整的结果
 * 请计算3.8向下取整的结果
 * 请计算5.6四舍五入取整的结果
 */
public class Main {
    public static void main(String[] args) {
        //请计算3的5次幂
        double pow = Math.pow(3, 5);
        System.out.println(pow);

        //请计算3.2向上取整的结果
        double ceil = Math.ceil(3.2);
        System.out.println(ceil);

        //请计算3.8向下取整的结果
        double floor = Math.floor(3.8);
        System.out.println(floor);

        //请计算5.6四舍五入取整的结果
        long round = Math.round(5.6);
        System.out.println(round);
    }
}
