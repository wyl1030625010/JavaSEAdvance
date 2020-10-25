package com.itheima.homework.T3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ��ʹ��TreeMap���ϱ�����ģ��Ϣ,Ҫ������ģ����Ϊ��,��ͥסַΪֵ,��������ģ������Ӵ�С��������;
 * <p>
 * ��Ϣ����:
 * <p>
 * 18�������,����
 * <p>
 * 20�������,�Ϻ�
 * <p>
 * 35�������,���
 * <p>
 * 21�������,����
 * <p>
 * 19�������,�Ϻ�
 * <p>
 * **Ҫ��:**
 * <p>
 * 1:��ģ������������������������;
 * <p>
 * 2:���������Ϣ��,ʹ�ô���ɾ����������Ϣ
 * <p>
 * 3:���������Ϣ��,ʹ�ô����޸����ĵļ�ͥסַΪ֣��
 * <p>
 * 4:ʹ���������ַ�ʽ���������е���Ϣ�����;
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<ModelOfLabor, String> treeMap = new TreeMap<>((mol1, mol2) -> mol2.getAge() - mol1.getAge());
        {
            treeMap.put(new ModelOfLabor("����", 20), "�Ϻ�");
            treeMap.put(new ModelOfLabor("����", 35), "���");
            treeMap.put(new ModelOfLabor("����", 21), "����");
            treeMap.put(new ModelOfLabor("����", 19), "�Ϻ�");
            treeMap.put(new ModelOfLabor("����", 18), "����");
        }

        Set<ModelOfLabor> keySet = treeMap.keySet();
        for (ModelOfLabor mol : keySet) {
            if ("����".equals(mol.getName())) {
                System.out.println(treeMap.remove(mol));
            }

            if ("����".equals(mol.getName())) {
                treeMap.put(mol, "֣��");
            }
        }

        System.out.println("------��һ�ַ�ʽ------");
        Set<Map.Entry<ModelOfLabor, String>> entries = treeMap.entrySet();
        for (Map.Entry<ModelOfLabor, String> entry : entries) {
            System.out.println(entry.getKey().getAge() + "��" + entry.getKey().getName() + "," + entry.getValue());
        }
        System.out.println();
        System.out.println();

        System.out.println("------�ڶ��ַ�ʽ------");
        treeMap.forEach(((key, value) -> {
            System.out.println(key.getAge() + "��" + key.getName() + "," + value);
        }));
    }
}
