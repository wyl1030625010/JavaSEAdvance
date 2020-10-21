package com.itheima.class_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01_Collection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("dddd");
        collection.add("dddd");

        System.out.println(collection.size());

        //��������ɾ��
        collection.remove("aaa");
        //��������ɾ��
        collection.removeIf(s -> "dddd".equals(s));

        System.out.println(collection.contains("bbb"));

        //����б�
        collection.clear();
        System.out.println(collection);

        //�ж��Ƿ�Ϊ��
        System.out.println(collection.isEmpty());
    }
}
