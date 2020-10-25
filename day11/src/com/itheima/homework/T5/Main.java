package com.itheima.homework.T5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 1.����¼��3��ѧ����Ϣ,�洢��ѧ������(����,����).Ȼ����ӵ�ArrayList������.
 * 2.����¼��3����ס����Ϣ,��ӵ���һ������ArrayList;
 * 3.������list�����е������ռ���ͬһ��map������,����ѧ���Զ���,ֵ�Ǿ�ס��ַ.
 * 4.Ҫ��map�����в��ܴ�����ͬ��ѧ����Ϣ.������ѧ�����併������
 * <p>
 * 5.ʹ��Stream������������������ŵ�����Ϣ;
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<String> address = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("�������" + (i + 1) + "��ѧ����Ϣ��");
            String msg = sc.next();
            String[] split = msg.split("��");
            students.add(new Student(split[0], Integer.parseInt(split[1])));
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("�������" + (i + 1) + "����ַ��");
            address.add(sc.next());
        }

        System.out.println();

        TreeMap<Student, String> treeMap = new TreeMap<>();

        for (int i = 0; i < 3; i++) {
            treeMap.put(students.get(i), address.get(i));
        }

        Set<Student> keySet = treeMap.keySet();
        keySet.stream().filter(student -> student.getName().startsWith("��")).forEach(System.out::println);
    }
}
