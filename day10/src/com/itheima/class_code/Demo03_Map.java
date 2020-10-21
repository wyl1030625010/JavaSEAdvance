package com.itheima.class_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Demo03_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1夫", "1妻");
        map.put("2夫", "2妻");
        map.put("3夫", "3妻");
        map.put("4夫", "4妻");

        //第一种遍历方法
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + "------" + map.get(s));
        }

        System.out.println("---------------------------------------");

        //第二种遍历方法
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }

        System.out.println("---------------------------------------");

        //第三种遍历方法
        map.forEach((String Key, String value) -> {
            System.out.println(Key + "------" + value);
        });

        System.out.println("---------------------------------------");

        //第四种遍历方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String Key, String value) {
                System.out.println(Key + "------" + value);
            }
        });

    }
}
