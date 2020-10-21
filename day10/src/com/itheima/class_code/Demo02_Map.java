package com.itheima.class_code;

import java.util.HashMap;
import java.util.Map;

public class Demo02_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //put() ��Ӽ�ֵ�� Key�����ظ�
        map.put("01", "����");
        map.put("02", "����");
        map.put("03", "����");
        map.put("04", "����");

        //String put(key,value) ��key��ԭ�е�Ԫ���滻���µģ�������ԭ����Ԫ��
        System.out.println(map.put("01", "tihuan"));

        //��key�ļ�ֵ��ɾ����������value
        System.out.println(map.remove("01"));

        //��key��value�ļ�ֵ��ɾ����������boolean
        System.out.println(map.remove("02", "����"));

        //����Key�����Ƿ����
        System.out.println(map.containsKey("03"));

        //����value�����Ƿ����
        System.out.println(map.containsValue("����"));

        //���map
        map.clear();

        //�ж�map�Ƿ�Ϊ��
        System.out.println(map.isEmpty());

        //map����
        System.out.println(map.size());
    }
}
