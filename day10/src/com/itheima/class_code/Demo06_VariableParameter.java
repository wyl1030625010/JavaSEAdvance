package com.itheima.class_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo06_VariableParameter {
    public static void main(String[] args) {
        //���ÿɱ�����������ɱ伯��
        //���ɱ伯�ϲ�����ɾ��
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        Map<Integer, Integer> map = Map.of(1, 1, 2, 2, 3, 3);
        Map<Integer, Integer> map2 = Map.ofEntries();

        //���ò��ɱ伯���������
        ArrayList<Integer> al = new ArrayList<>(list);
        System.out.println(al);
    }
}
