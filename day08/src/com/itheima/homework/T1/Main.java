package com.itheima.homework.T1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �붨��һ��Collection���͵ļ��ϣ��洢�����ַ�����
 * ��JavaEE��ҵ������ָ�ϡ�����Oracle�߼���̡�����MySQL�����ŵ���ͨ������Java�ܹ�ʦ֮·��
 * **Ҫ��:**
 * ����ʵ�����¹��ܣ�
 * ʹ�õ�������������Ԫ�أ�����ӡ
 * ʹ�õ�������������Ԫ�أ�ɸѡ����С��10���ַ��ģ�����ӡ��
 * ʹ�õ�������������Ԫ�أ�ɸѡ�����а�����Java���ģ�����ӡ
 * ��������а�����Oracle������ɾ�����顣ɾ���󣬱������ϣ���ӡ����������
 * (ע�⣺����ÿ�����ܶ�����д����������main������������ò��Լ���)
 */
public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("JavaEE��ҵ������ָ��");
        collection.add("Oracle�߼����");
        collection.add("MySQL�����ŵ���ͨ");
        collection.add("Java�ܹ�ʦ֮·");


        one(collection);
        System.out.println("-------------------------");
        two(collection);
        System.out.println("-------------------------");
        three(collection);
        System.out.println("-------------------------");
        fore(collection);
    }

    private static void fore(Collection<String> collection) {
        collection.removeIf(s -> s.contains("Oracle"));
        System.out.println(collection);
    }

    private static void three(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains("Java")) {
                System.out.println(next);
            }
        }
    }

    private static void two(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() < 10) {
                System.out.println(next);
            }
        }
    }

    private static void one(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
