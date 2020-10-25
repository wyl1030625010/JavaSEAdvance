package com.itheima.homework.T4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 定义main()方法，按以下顺序编写程序：
 * 定义集合List<String>，添加以下数据：
 * "王佳乐","张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏"
 * <p>
 * **要求:**
 * 1:筛选出所有的“张”姓学员；
 * 2:筛选出所有的“王”姓学员；
 * 3:将两个流合并为一个流后找出名字是3个字的名字数量
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏"));

        Stream<String> stream1 = list.stream().filter(str -> str.startsWith("张"));
        Stream<String> stream2 = list.stream().filter(str -> str.startsWith("王"));

        System.out.println(Stream.concat(stream1, stream2).filter(str -> str.length() == 3).count());
    }
}
