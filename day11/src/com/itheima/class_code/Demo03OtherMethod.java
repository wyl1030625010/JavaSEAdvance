package com.itheima.class_code;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Administrator
 */
public class Demo03OtherMethod {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("王三");
        strings.add("李四");
        strings.add("王五");
        strings.add("赵六");
        strings.add("赵六");

        //截取
        strings.stream().limit(3).forEach(System.out::println);
        System.out.println("----------------");

        //截取
        strings.stream().skip(3).forEach(System.out::println);
        System.out.println("----------------");

        //合并流
        Stream.concat(strings.stream().limit(3), strings.stream()).skip(strings.size() - 3).forEach(System.out::println);
        System.out.println("----------------");

        //去重
        strings.stream().distinct().filter(s -> s.startsWith("张")).forEach(System.out::println);
    }
}
