package com.itheima.homework.T4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * ����main()������������˳���д����
 * ���弯��List<String>������������ݣ�
 * "������","������","��˼��","�ŷ�","������","����ӱ","����"
 * <p>
 * **Ҫ��:**
 * 1:ɸѡ�����еġ��š���ѧԱ��
 * 2:ɸѡ�����еġ�������ѧԱ��
 * 3:���������ϲ�Ϊһ�������ҳ�������3���ֵ���������
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("������", "������", "��˼��", "�ŷ�", "������", "����ӱ", "����"));

        Stream<String> stream1 = list.stream().filter(str -> str.startsWith("��"));
        Stream<String> stream2 = list.stream().filter(str -> str.startsWith("��"));

        System.out.println(Stream.concat(stream1, stream2).filter(str -> str.length() == 3).count());
    }
}
