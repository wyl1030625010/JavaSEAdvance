package com.itheima.class_code;

import java.util.ArrayList;

public class Demo04EndMethod {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");

        //forEach
        strings.stream().forEach(System.out::println);


        //count
        System.out.println(strings.stream().count());


    }
}
