package com.itheima.class_code;

import java.math.BigDecimal;

public class Demo04_BigDecimal {
    public static void main(String[] args) {
        //BigDecimal 主要用于精确计算
        //输入参数主要使用字符串
        BigDecimal bigDecimal1 = new BigDecimal("0.2");
        BigDecimal bigDecimal2 = new BigDecimal("0.1");
        System.out.println(bigDecimal1);

        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println("+：" + add);

        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println("-：" + subtract);

        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
        System.out.println("*：" + multiply);

        BigDecimal divide = bigDecimal1.divide(bigDecimal2);
        System.out.println("/：" + divide);


    }
}
