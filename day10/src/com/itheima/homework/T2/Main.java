package com.itheima.homework.T2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 请使用HashMap集合保存街道两旁的店铺名称;使用门牌号作为键,店铺名作为值,然后使用**三种方式**遍历输出;
 * <p>
 * 信息如下:
 * <p>
 * 101,阿三面馆
 * <p>
 * 102,阿四粥馆
 * <p>
 * 103,阿五米馆
 * <p>
 * 104,阿六快递
 * <p>
 * **要求:**
 * <p>
 * 1:键是整数,值是字符串;
 * <p>
 * 2:输出的信息使用"--"链接
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "阿三面馆");
        map.put(102, "阿四粥馆");
        map.put(103, "阿五米馆");
        map.put(104, "阿六快递");

        System.out.println("--------第一种方法--------");
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            System.out.println(map.get(integer) + "-----" + integer);
        }
        System.out.println();

        System.out.println("--------第二种方法--------");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }
        System.out.println();

        System.out.println("--------第三种方法--------");
        map.forEach((key, value) -> {
            System.out.println(key + "-----" + value);
        });
    }
}
