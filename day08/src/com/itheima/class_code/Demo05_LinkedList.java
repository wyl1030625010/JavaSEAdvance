package com.itheima.class_code;

import java.util.LinkedList;

public class Demo05_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ddd");
        linkedList.add("ccc");
        linkedList.add("ddd");

        //�ڿ�ͷ�������
        linkedList.addFirst("0000");

        //�ڽ�β�������
        linkedList.addLast("9999");

        System.out.println(linkedList);

        //��ȡ��ͷ��Ԫ��
        System.out.println(linkedList.getFirst());

        //��ȡĩβ��Ԫ��
        System.out.println(linkedList.getLast());

        //ɾ����ͷ��Ԫ��
        System.out.println(linkedList.removeFirst());

        //ɾ��ĩβ��Ԫ��
        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);
    }
}
