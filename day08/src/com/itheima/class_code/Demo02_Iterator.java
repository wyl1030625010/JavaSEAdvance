package com.itheima.class_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02_Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("dddd");
        collection.add("dddd");
        collection.add("dddd");

        //����������
        Iterator<String> iterator = collection.iterator();

        //hasNext �жϴ���Ԫ��
        //next ��0λ������ȡ����Ԫ��
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
