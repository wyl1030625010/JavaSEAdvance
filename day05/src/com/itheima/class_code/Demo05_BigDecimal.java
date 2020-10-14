package com.itheima.class_code;

import java.math.BigDecimal;

public class Demo05_BigDecimal {
    public static void main(String[] args) {

        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("3.0");

        //����BigDecimal�Ǹ߾��ȼ��㣬��10 / 3 �޷����������Ա��� java.lang.ArithmeticException
//        BigDecimal divide = bigDecimal1.divide(bigDecimal2);
//        System.out.println(divide);

        //ROUND_CEILING ��һ��
        BigDecimal divide1 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_CEILING);
        System.out.println(divide1);

        //ROUND_HALF_UP ��������
        BigDecimal divide2 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide2);

        //ROUND_FLOOR ȥβ��
        BigDecimal divide3 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_FLOOR);
        System.out.println(divide3);
    }
}
