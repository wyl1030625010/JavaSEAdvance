package com.itheima.homework;

import java.util.Random;
import java.util.TreeSet;

/**
 * 随机生成8个不重复的10至20之间的随机数并保存Set集合中,然后打印出集合中所有的数据;
 * <p>
 * **要求:**
 * <p>
 * 使用TreeSet集合实现;
 */
public class T2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int randomNum = random.nextInt(11) + 10;
            ts.add(randomNum);
            System.out.println("第" + (i + 1) + "次生成的随机数是" + randomNum);
        }

        System.out.println(ts);
    }
}
