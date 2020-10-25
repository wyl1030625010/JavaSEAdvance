package com.itheima.class_code;

import java.util.ArrayList;

public class Demo04EndMethod {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("王三");
        strings.add("李四");
        strings.add("王五");
        strings.add("赵六");
        strings.add("赵六");

        //forEach
        strings.stream().forEach(System.out::println);


        //count
        System.out.println(strings.stream().count());


    }
}
