package com.itheima.homework;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 已知数组信息如下:
 * <p>
 * {2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6}
 * <p>
 * 请使用代码找出上面数组中的所有的数据,要求重复的数据只能保留一份;
 * <p>
 * **要求:**
 * <p>
 * 使用HashSet集合实现;
 */
public class T1 {
    public static void main(String[] args) {
        Double[] arr = {2.2, 5.5, 6.6, 2.2, 8.8, 1.1, 2.2, 8.8, 5.5, 2.2, 6.6};

        HashSet<Double> hs = new HashSet<>(Arrays.asList(arr));

        System.out.println(hs);
    }
}
