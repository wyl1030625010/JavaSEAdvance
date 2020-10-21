package com.itheima.class_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Demo03_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1��", "1��");
        map.put("2��", "2��");
        map.put("3��", "3��");
        map.put("4��", "4��");

        //��һ�ֱ�������
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + "------" + map.get(s));
        }

        System.out.println("---------------------------------------");

        //�ڶ��ֱ�������
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }

        System.out.println("---------------------------------------");

        //�����ֱ�������
        map.forEach((String Key, String value) -> {
            System.out.println(Key + "------" + value);
        });

        System.out.println("---------------------------------------");

        //�����ֱ�������
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String Key, String value) {
                System.out.println(Key + "------" + value);
            }
        });

    }
}
