package com.itheima.class_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo06_VariableParameter {
    public static void main(String[] args) {
        //利用可变参数创建不可变集合
        //不可变集合不能增删改
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        Map<Integer, Integer> map = Map.of(1, 1, 2, 2, 3, 3);
        Map<Integer, Integer> map2 = Map.ofEntries();

        //利用不可变集合批量添加
        ArrayList<Integer> al = new ArrayList<>(list);
        System.out.println(al);
    }
}
