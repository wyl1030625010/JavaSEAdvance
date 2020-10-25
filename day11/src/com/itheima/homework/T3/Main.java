package com.itheima.homework.T3;

import java.util.HashSet;
import java.util.Set;

/**
 * 定义集合HashSet<String>，添加以下数据：
 * "王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏"
 * <p>
 * (注意set集合保存的数据并不一定会和添加的顺序一致,所以需要先输出set集合中所有的元素查看原始顺序)
 * <p>
 * **要求:**
 * 1:使用Stream流的filter()方法筛选集合中所有的“张”姓学员；
 * 筛选后，获取前两个，并打印。
 * 2:重新获取Stream流，用filter()方法筛选出所有的“王”姓学员；
 * 筛选后，跳过第1个，打印剩余的人员。
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Set.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏"));
        System.out.println(hashSet);
        System.out.println("--------------------");

        hashSet.stream().filter(str -> str.startsWith("张")).limit(2).forEach(System.out::println);
        System.out.println("--------------------");

        hashSet.stream().filter(str -> str.startsWith("王")).skip(1).forEach(System.out::println);
    }
}
