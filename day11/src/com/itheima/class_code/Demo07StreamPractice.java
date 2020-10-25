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
            manList.add("ÕÅ¹úÁ¢");
            manList.add("Áõèª");
            manList.add("ÁõÒã");
            manList.add("Ö£ÒÁ½¡");
            manList.add("Ğìá¿");
            manList.add("Íõ±¦Ç¿");
        }

        ArrayList<String> womanList = new ArrayList<>();
        {
            womanList.add("Ö£Ë¬");
            womanList.add("Ñî×Ï");
            womanList.add("¹ØÏşÍ®");
            womanList.add("ÕÅÌì°®");
            womanList.add("ÑîÃİ");
            womanList.add("ÕÔÀöÓ±");
        }

        Stream<String> stream1 = manList.stream().filter(name -> name.length() == 3).limit(2);
        Stream<String> stream2 = womanList.stream().filter(name -> name.startsWith("Ñî")).skip(1);

        List<String> collect = Stream.concat(stream1, stream2).collect(Collectors.toList());

        collect.forEach(name -> {
            System.out.println(new Actor(name));
        });
    }
}
