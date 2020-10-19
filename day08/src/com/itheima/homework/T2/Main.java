package com.itheima.homework.T2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 请定义一个Collection类型的集合，存储以下分数信息：
 * 88.5,39.2,77.1,56.8,89.0,99.0,59.5
 * <p>
 * **要求:**
 * <p>
 * 请编程实现以下功能：
 * 使用增强for遍历所有元素，并打印
 * 使用增强for遍历所有元素，打印不及格的分数；
 * 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
 * 使用增强for遍历所有元素，求出最高分，并打印；
 */
public class Main {
    public static void main(String[] args) {
        Collection<Double> collection = new ArrayList<>();
        collection.add(88.5);
        collection.add(39.2);
        collection.add(77.1);
        collection.add(56.8);
        collection.add(89.0);
        collection.add(99.0);
        collection.add(59.5);

        one(collection);
        System.out.println("--------------------");
        two(collection);
        System.out.println("--------------------");
        three(collection);
        System.out.println("--------------------");
        fore(collection);
        System.out.println("--------------------");
    }

    private static void fore(Collection<Double> collection) {
        double max = -1;

        for (Double aDouble : collection) {
            max = Math.max(max, aDouble);
        }

        System.out.println("最高分为：" + max);
    }

    private static void three(Collection<Double> collection) {
        int count = 0;
        int sum = 0;

        for (Double aDouble : collection) {
            if (aDouble < 60) {
                count++;
            }
            sum += aDouble;
        }

        System.out.println("不及格数量为：" + count);
        System.out.println("平均分为：" + (sum / collection.size()));
    }

    private static void two(Collection<Double> collection) {
        for (Double aDouble : collection) {
            if (aDouble < 60) {
                System.out.println(aDouble);
            }
        }
    }

    private static void one(Collection<Double> collection) {
        for (Double aDouble : collection) {
            System.out.println(aDouble);
        }
    }
}
