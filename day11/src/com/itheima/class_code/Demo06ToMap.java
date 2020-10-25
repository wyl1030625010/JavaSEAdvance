package com.itheima.class_code;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo06ToMap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三，23");
        list.add("李四，24");
        list.add("王五，25");

        Map<String, Integer> collect = list.stream().filter(s -> Integer.parseInt(s.split("，")[1]) > 23).collect(Collectors.toMap(
                s -> s.split("，")[0],
                s -> Integer.parseInt(s.split("，")[1])
        ));

        collect.forEach((key, value) -> System.out.println(key + "---" + value));


    }
}
