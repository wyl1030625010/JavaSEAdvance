package com.itheima.class_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02_Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("dddd");
        collection.add("dddd");

        //创建迭代器
        Iterator<String> iterator = collection.iterator();

        //hasNext 判断存在元素
        //next 从0位置依次取出置元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
