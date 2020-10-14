package com.itheima.class_code;

public class Demo06_Integer {
    public static void main(String[] args) {
        //int 类型的取值范围
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        //装箱
        Integer integer = Integer.valueOf(10);

        //拆箱
        int i = integer.intValue();
    }
}
