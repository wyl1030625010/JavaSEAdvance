package com.itheima.class_code;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo02filter {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");

        //strings.stream().filter(s -> !s.endsWith("��")).forEach(System.out::println);

        strings.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("��");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
