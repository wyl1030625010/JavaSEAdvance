package com.itheima.class_code;

import java.util.ArrayList;
import java.util.List;

public class Demo04_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");

        //向索引处添加数据
        list.add(0, "000");

        System.out.println(list);

        //根据元素删除
        list.remove("ccc");

        //根据索引删除
        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
