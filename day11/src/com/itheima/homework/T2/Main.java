package com.itheima.homework.T2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 随机生成10个10至20之间的随机数(数字允许重复),使用Stream流的技术,找出大于15的元素并打印出来;
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(11) + 10);
        }

        System.out.println(list);

        list.stream().filter(num -> num > 15).forEach(System.out::println);
    }
}
