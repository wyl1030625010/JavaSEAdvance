package com.itheima.class_code;

import java.util.ArrayList;

public class Demo01_Collection {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(arr.toString());
        System.out.println(list);
    }
}
