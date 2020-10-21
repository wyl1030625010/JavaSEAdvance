package com.itheima.homework.T2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ��ʹ��HashMap���ϱ���ֵ����Եĵ�������;ʹ�����ƺ���Ϊ��,��������Ϊֵ,Ȼ��ʹ��**���ַ�ʽ**�������;
 * <p>
 * ��Ϣ����:
 * <p>
 * 101,�������
 * <p>
 * 102,�������
 * <p>
 * 103,�����׹�
 * <p>
 * 104,�������
 * <p>
 * **Ҫ��:**
 * <p>
 * 1:��������,ֵ���ַ���;
 * <p>
 * 2:�������Ϣʹ��"--"����
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "�������");
        map.put(102, "�������");
        map.put(103, "�����׹�");
        map.put(104, "�������");

        System.out.println("--------��һ�ַ���--------");
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            System.out.println(map.get(integer) + "-----" + integer);
        }
        System.out.println();

        System.out.println("--------�ڶ��ַ���--------");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }
        System.out.println();

        System.out.println("--------�����ַ���--------");
        map.forEach((key, value) -> {
            System.out.println(key + "-----" + value);
        });
    }
}
