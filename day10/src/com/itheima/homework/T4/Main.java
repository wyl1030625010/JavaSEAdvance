package com.itheima.homework.T4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ��дJava���򣬴���3��ArrayList����ÿ�����������ѧԱ������.�ٴ���HashMap�������꼶Ϊ����
 * ���ѧԱ��ArrayListΪֵ��Ȼ���HashMap������ȡ��ĳ���༶��ѧԱ��Ϣ�����
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> class1 = new ArrayList<>();
        class1.add(new Student("����", 85));
        class1.add(new Student("����", 90));
        class1.add(new Student("����", 61));

        HashMap<String, ArrayList<Student>> hashMap = new HashMap<>();
        hashMap.put("java1��", class1);

        hashMap.forEach((key, value) -> {
            System.out.println(key + "��");
            for (Student student : value) {
                System.out.println(student);
            }
        });
    }
}
