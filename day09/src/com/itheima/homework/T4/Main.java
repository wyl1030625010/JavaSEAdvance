package com.itheima.homework.T4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ��дJava���򣬴���3��ArrayList����ÿ�����������ѧԱ������.�ٴ���HashMap�������꼶Ϊ����
 * ���ѧԱ��ArrayListΪֵ��Ȼ���HashMap������ȡ��ĳ���༶��ѧԱ��Ϣ�����
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> stu1 = new ArrayList<>();
        stu1.add(new Student("����", 85));

        ArrayList<Student> stu2 = new ArrayList<>();
        stu2.add(new Student("����", 90));

        ArrayList<Student> stu3 = new ArrayList<>();
        stu3.add(new Student("����", 61));

        HashMap<String, ArrayList<Student>> hm = new HashMap<>();

        hm.put("Java1", stu1);
        hm.put("Java2", stu2);
        hm.put("Java3", stu3);

        System.out.println(hm);

    }
}
