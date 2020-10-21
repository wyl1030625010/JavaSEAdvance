package com.itheima.class_code;

import java.util.HashMap;
import java.util.Map;

public class Demo02_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //put() 添加键值对 Key不能重复
        map.put("01", "张三");
        map.put("02", "李四");
        map.put("03", "王五");
        map.put("04", "赵六");

        //String put(key,value) 把key中原有的元素替换称新的，并返回原来的元素
        System.out.println(map.put("01", "tihuan"));

        //把key的键值对删除，并返回value
        System.out.println(map.remove("01"));

        //把key和value的键值对删除，并返回boolean
        System.out.println(map.remove("02", "张三"));

        //根据Key查找是否存在
        System.out.println(map.containsKey("03"));

        //根据value查找是否存在
        System.out.println(map.containsValue("张三"));

        //清空map
        map.clear();

        //判断map是否为空
        System.out.println(map.isEmpty());

        //map长度
        System.out.println(map.size());
    }
}
