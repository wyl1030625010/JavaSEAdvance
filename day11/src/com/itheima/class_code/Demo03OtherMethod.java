package com.itheima.class_code;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Administrator
 */
public class Demo03OtherMethod {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings.add("����");

        //��ȡ
        strings.stream().limit(3).forEach(System.out::println);
        System.out.println("----------------");

        //��ȡ
        strings.stream().skip(3).forEach(System.out::println);
        System.out.println("----------------");

        //�ϲ���
        Stream.concat(strings.stream().limit(3), strings.stream()).skip(strings.size() - 3).forEach(System.out::println);
        System.out.println("----------------");

        //ȥ��
        strings.stream().distinct().filter(s -> s.startsWith("��")).forEach(System.out::println);
    }
}
