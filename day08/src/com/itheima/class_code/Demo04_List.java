package com.itheima.class_code;

import java.util.ArrayList;
import java.util.List;

public class Demo04_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");

        //���������������
        list.add(0, "000");

        System.out.println(list);

        //����Ԫ��ɾ��
        list.remove("ccc");

        //��������ɾ��
        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
