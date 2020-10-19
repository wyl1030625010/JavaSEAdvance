package com.itheima.class_code;

import java.util.HashSet;
import java.util.Set;

public class Demo03_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("aaa");
        set.add("bbb");

        for (String s : set) {
            System.out.println(s);
        }

        boolean b = set.removeIf(s -> "aaa".equals(s));

        for (String s : set) {
            System.out.println(s);
        }
    }
}
