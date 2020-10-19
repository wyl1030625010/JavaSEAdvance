package com.itheima.homework.T2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �붨��һ��Collection���͵ļ��ϣ��洢���·�����Ϣ��
 * 88.5,39.2,77.1,56.8,89.0,99.0,59.5
 * <p>
 * **Ҫ��:**
 * <p>
 * ����ʵ�����¹��ܣ�
 * ʹ����ǿfor��������Ԫ�أ�����ӡ
 * ʹ����ǿfor��������Ԫ�أ���ӡ������ķ�����
 * ʹ����ǿfor��������Ԫ�أ����㲻����ķ�������������ƽ���֣�����ӡ��������
 * ʹ����ǿfor��������Ԫ�أ������߷֣�����ӡ��
 */
public class Main {
    public static void main(String[] args) {
        Collection<Double> collection = new ArrayList<>();
        collection.add(88.5);
        collection.add(39.2);
        collection.add(77.1);
        collection.add(56.8);
        collection.add(89.0);
        collection.add(99.0);
        collection.add(59.5);

        one(collection);
        System.out.println("--------------------");
        two(collection);
        System.out.println("--------------------");
        three(collection);
        System.out.println("--------------------");
        fore(collection);
        System.out.println("--------------------");
    }

    private static void fore(Collection<Double> collection) {
        double max = -1;

        for (Double aDouble : collection) {
            max = Math.max(max, aDouble);
        }

        System.out.println("��߷�Ϊ��" + max);
    }

    private static void three(Collection<Double> collection) {
        int count = 0;
        int sum = 0;

        for (Double aDouble : collection) {
            if (aDouble < 60) {
                count++;
            }
            sum += aDouble;
        }

        System.out.println("����������Ϊ��" + count);
        System.out.println("ƽ����Ϊ��" + (sum / collection.size()));
    }

    private static void two(Collection<Double> collection) {
        for (Double aDouble : collection) {
            if (aDouble < 60) {
                System.out.println(aDouble);
            }
        }
    }

    private static void one(Collection<Double> collection) {
        for (Double aDouble : collection) {
            System.out.println(aDouble);
        }
    }
}
