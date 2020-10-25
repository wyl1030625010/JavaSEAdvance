package com.itheima.homework.T6;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * �ҹ���34��ʡ�����������ֱ��ǣ� 23��ʡ���ӱ�ʡ��ɽ��ʡ������ʡ������ʡ��������ʡ������ʡ������ʡ���ຣʡ��ɽ��ʡ��
 * ����ʡ���㽭ʡ��̨��ʡ������ʡ������ʡ������ʡ������ʡ������ʡ������ʡ���㶫ʡ������ʡ���Ĵ�ʡ������ʡ������ʡ��
 * 4��ֱϽ�У������С�����С��Ϻ��С������С� 5�������������ɹ����������½�ά��������������Ļ���������������׳����������������������
 * 2���ر�������������ر��������������ر��������� ��ʹ��������������в�����
 * 1��ͳ�������ֵ�ʡ�ݵĸ���
 * 2��ͳ�������а�����λ���ʵ�ʡ�ݣ������ϱ����ĸ���
 * 3����ӡ�����а�����λ���ʵ���ͨʡ�ݣ���������ֱϽ���ر���������������
 * 4�������е�����ʡ�ݣ�������ֱϽ���ر�����������ȡ�������ŵ���������
 */
public class Main {
    public static void main(String[] args) {
        String address = "�ӱ�ʡ��ɽ��ʡ������ʡ������ʡ��������ʡ������ʡ������ʡ���ຣʡ��ɽ��ʡ������ʡ���㽭ʡ��̨��ʡ������ʡ������ʡ������ʡ������ʡ��" +
                "����ʡ������ʡ���㶫ʡ������ʡ���Ĵ�ʡ������ʡ������ʡ�������С�����С��Ϻ��С������С�" +
                "���ɹ����������½�ά��������������Ļ���������������׳��������������������������ر��������������ر�������";

        String[] split = address.split("��");
        String[] a;

        System.out.println(Arrays.stream(split).filter(add -> add.length() == 3).count());

        System.out.println(Arrays.stream(split).filter(add -> add.contains("��") ||
                add.contains("��") ||
                add.contains("��") ||
                add.contains("��")).count());

        Arrays.stream(split).filter(add -> (add.contains("��") ||
                add.contains("��") ||
                add.contains("��") ||
                add.contains("��")) && !
                (add.contains("������"))).forEach(System.out::println);

        System.out.println();

        String[] collect = Arrays.stream(split).filter(add -> (add.contains("������") ||
                add.contains("��") ||
                add.contains("�ر�������"))).toArray(String[]::new);

        System.out.println(Arrays.toString(collect));

//        String[] strings = collect.toArray(new String[collect.size()]);
//        System.out.println(Arrays.toString(strings));
    }
}
