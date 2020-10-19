package com.itheima.class_code;

import java.util.LinkedList;

public class Demo05_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ddd");
        linkedList.add("ccc");
        linkedList.add("ddd");

        //在开头添加数据
        linkedList.addFirst("0000");

        //在结尾添加数据
        linkedList.addLast("9999");

        System.out.println(linkedList);

        //获取开头的元素
        System.out.println(linkedList.getFirst());

        //获取末尾的元素
        System.out.println(linkedList.getLast());

        //删除开头的元素
        System.out.println(linkedList.removeFirst());

        //删除末尾的元素
        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);
    }
}
