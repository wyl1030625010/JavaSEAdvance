package com.itheima.class_code;

import java.math.BigDecimal;

public class Demo05_BigDecimal {
    public static void main(String[] args) {

        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("3.0");

        //由于BigDecimal是高精度计算，但10 / 3 无法除尽，所以报错 java.lang.ArithmeticException
//        BigDecimal divide = bigDecimal1.divide(bigDecimal2);
//        System.out.println(divide);

        //ROUND_CEILING 进一法
        BigDecimal divide1 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_CEILING);
        System.out.println(divide1);

        //ROUND_HALF_UP 四舍五入
        BigDecimal divide2 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide2);

        //ROUND_FLOOR 去尾法
        BigDecimal divide3 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_FLOOR);
        System.out.println(divide3);
    }
}
