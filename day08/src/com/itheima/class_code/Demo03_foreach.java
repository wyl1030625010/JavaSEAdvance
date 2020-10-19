package com.itheima.class_code;

import java.util.*;

public class Demo03_foreach {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        collection.add("eee");

        for (String s : collection) {
            System.out.println(s);
        }

        System.out.println(collection);
    }
}
