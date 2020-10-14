package com.itheima.homework.T2;

import java.util.ArrayList;

/**
 * 请定义一个集合,并将1至1千万这1千万个数字添加到集合中，计算这个行为运行的时间，并打印。
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
