package com.itheima.homework.T1;

import java.util.HashSet;

/**
 * ��������3������,��ʹ��HashSet���ϱ���3�����ѵ���Ϣ;
 * <p>
 * ��Ϣ����:
 * <p>
 * ����ӱ,18
 * <p>
 * ������,20
 * <p>
 * ����,19
 * <p>
 * **Ҫ��:**
 * <p>
 * 1:�����Զ�����ʽ����,����������������������;
 * <p>
 * 2:ʹ�ô��뱣֤������ͬ��ͬ����Ķ���ֻ��һ��;(��ͬ����������Ķ�����Ϊ��ͬһ������)
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Roomie> set = new HashSet<>();
        set.add(new Roomie("����ӱ", 18));
        set.add(new Roomie("������", 20));
        set.add(new Roomie("����", 19));
        
        System.out.println(set);
    }
}
