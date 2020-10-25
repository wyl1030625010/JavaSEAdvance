package com.itheima.homework.T3;

import java.util.HashSet;
import java.util.Set;

/**
 * ���弯��HashSet<String>������������ݣ�
 * "������","������","��˼��","�ŷ�","������","����ӱ","����"
 * <p>
 * (ע��set���ϱ�������ݲ���һ�������ӵ�˳��һ��,������Ҫ�����set���������е�Ԫ�ز鿴ԭʼ˳��)
 * <p>
 * **Ҫ��:**
 * 1:ʹ��Stream����filter()����ɸѡ���������еġ��š���ѧԱ��
 * ɸѡ�󣬻�ȡǰ����������ӡ��
 * 2:���»�ȡStream������filter()����ɸѡ�����еġ�������ѧԱ��
 * ɸѡ��������1������ӡʣ�����Ա��
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Set.of("������", "������", "��˼��", "�ŷ�", "������", "����ӱ", "����"));
        System.out.println(hashSet);
        System.out.println("--------------------");

        hashSet.stream().filter(str -> str.startsWith("��")).limit(2).forEach(System.out::println);
        System.out.println("--------------------");

        hashSet.stream().filter(str -> str.startsWith("��")).skip(1).forEach(System.out::println);
    }
}
