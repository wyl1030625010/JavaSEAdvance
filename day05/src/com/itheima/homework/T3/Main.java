package com.itheima.homework.T3;

import java.math.BigDecimal;

/**
 * ������double�����ƽ��ֵ(�������뱣����λС��)��
 * <p>
 * double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
 */
public class Main {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};

        BigDecimal sumDb = new BigDecimal("0");

        for (int i = 0; i < arr.length; i++) {
            sumDb = sumDb.add(new BigDecimal(arr[i]));
        }

        System.out.println(sumDb.divide(new BigDecimal(arr.length), 2, BigDecimal.ROUND_HALF_UP));
    }
}
