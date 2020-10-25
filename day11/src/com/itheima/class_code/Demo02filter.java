package com.itheima.class_code;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo02filter {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("王三");
        strings.add("李四");
        strings.add("王五");
        strings.add("赵六");

        //strings.stream().filter(s -> !s.endsWith("三")).forEach(System.out::println);

        strings.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("王");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
