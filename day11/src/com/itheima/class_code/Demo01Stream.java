package com.itheima.class_code;

import java.util.*;
import java.util.stream.Stream;

public class Demo01Stream {
    public static void main(String[] args) {
        //单列集合
        //mehtod1();

        //双列集合
        //method2();

        //数组
        //method3();

        //同类型数据
        Stream.of(1, 2, 3, 4, 5, 6).forEach(System.out::println);
    }

    private static void method3() {
        int[] arr = {1, 2, 3};
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void method2() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        //keySet
        Set<String> set = hashMap.keySet();
        set.stream().forEach(System.out::println);
        System.out.println("------------------");
        //entrySet
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        entries.stream().forEach(System.out::println);
    }

    private static void mehtod1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.stream().forEach(System.out::println);
    }
}
