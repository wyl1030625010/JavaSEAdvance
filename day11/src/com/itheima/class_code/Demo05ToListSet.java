package com.itheima.class_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo05ToListSet {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");

        System.out.println("[    toList  ]");
        List<String> list = strings.stream().filter(s -> !s.startsWith("��")).collect(Collectors.toList());
        System.out.println(list);
        System.out.println();

        System.out.println("[    toSet    ]");
        Set<String> set = strings.stream().filter(s -> !s.startsWith("��")).collect(Collectors.toSet());
        System.out.println(set);
    }
}
