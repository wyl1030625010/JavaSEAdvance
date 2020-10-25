package com.itheima.class_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo05ToListSet {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("王三");
        strings.add("李四");
        strings.add("王五");
        strings.add("赵六");
        strings.add("赵六");

        System.out.println("[    toList  ]");
        List<String> list = strings.stream().filter(s -> !s.startsWith("王")).collect(Collectors.toList());
        System.out.println(list);
        System.out.println();

        System.out.println("[    toSet    ]");
        Set<String> set = strings.stream().filter(s -> !s.startsWith("王")).collect(Collectors.toSet());
        System.out.println(set);
    }
}
