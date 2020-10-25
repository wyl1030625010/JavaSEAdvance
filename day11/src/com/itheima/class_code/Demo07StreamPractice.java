package com.itheima.class_code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 */
public class Demo07StreamPractice {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        {
            manList.add("�Ź���");
            manList.add("���");
            manList.add("����");
            manList.add("֣����");
            manList.add("���");
            manList.add("����ǿ");
        }

        ArrayList<String> womanList = new ArrayList<>();
        {
            womanList.add("֣ˬ");
            womanList.add("����");
            womanList.add("����ͮ");
            womanList.add("���찮");
            womanList.add("����");
            womanList.add("����ӱ");
        }

        Stream<String> stream1 = manList.stream().filter(name -> name.length() == 3).limit(2);
        Stream<String> stream2 = womanList.stream().filter(name -> name.startsWith("��")).skip(1);

        List<String> collect = Stream.concat(stream1, stream2).collect(Collectors.toList());

        collect.forEach(name -> {
            System.out.println(new Actor(name));
        });
    }
}
