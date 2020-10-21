package com.itheima.class_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01_Collection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("dddd");
        collection.add("dddd");

        System.out.println(collection.size());

        //根据内容删除
        collection.remove("aaa");
        //根据条件删除
        collection.removeIf(s -> "dddd".equals(s));

        System.out.println(collection.contains("bbb"));

        //清空列表
        collection.clear();
        System.out.println(collection);

        //判断是否为空
        System.out.println(collection.isEmpty());
    }
}
