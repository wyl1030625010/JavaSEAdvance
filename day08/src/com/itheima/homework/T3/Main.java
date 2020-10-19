package com.itheima.homework.T3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �붨�巽���ҳ��������������ŵ��˲����������18��Ĳ�ȫ������,Ȼ����main������������ص���;
 * ����ԭʼ������: ����,22   ����,26    �Ŵ�ɽ,38    ����,19    ������,103    ���޼�,17    ����,16
 * <p>
 * **Ҫ��:**
 * <p>
 * �����е�����Ҫ�Զ������ʽ����,��ֻҪ������������������Ա��������;
 */
public class Main {
    public static void main(String[] args) {
        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("����", 22));
        collection.add(new Person("����", 26));
        collection.add(new Person("�Ŵ�ɽ", 38));
        collection.add(new Person("����", 19));
        collection.add(new Person("������", 103));
        collection.add(new Person("���޼�", 17));
        collection.add(new Person("����", 16));

        Collection<Person> recult = check(collection);

        for (Person person : recult) {
            System.out.println(person);
        }
    }

    private static Collection<Person> check(Collection<Person> collection) {
        Collection<Person> recult = new ArrayList<>();
        for (Person person : collection) {
            if (person.getName().contains("��") && person.getAge() > 18) {
                recult.add(person);
            }
        }
        return recult;
    }
}
