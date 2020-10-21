package com.itheima.class_code;

import java.util.Comparator;
import java.util.TreeSet;


public class Demo05_TeacherTreeSet {
    public static void main(String[] args) {
        //TreeSet(Comparator<? super E> comparator) ����һ���µġ��յ�����������ָ���ıȽ�����������
        //Lambda���ʽ
        TreeSet<Teacher> treeSet = new TreeSet<>((o1, o2) -> {
            //��Ҫ����
            //���������������
            int recult = o1.getAge() - o2.getAge();

            //��Ҫ����
            //���������������ʱ������ASCII����������ĸ��ʼ���ж������е���ĸ����ĸ��ǰ������ߣ���������ұ�
            recult = recult == 0 ? o1.getName().compareTo(o2.getName()) : recult;

            return recult;
        });

      /*
      //�����ڲ���
      TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //��Ҫ����
                //���������������
                int recult = o1.getAge() - o2.getAge();

                //��Ҫ����
                //���������������ʱ������ASCII����������ĸ��ʼ���ж������е���ĸ����ĸ��ǰ������ߣ���������ұ�
                recult = recult == 0 ? o1.getName().compareTo(o2.getName()) : recult;

                return recult;
            }
        });*/

        treeSet.add(new Teacher("010", "zhangsan", 18));
        treeSet.add(new Teacher("011", "lsii", 17));
        treeSet.add(new Teacher("017", "wangwu", 20));
        treeSet.add(new Teacher("014", "zhaoliu", 18));
        treeSet.add(new Teacher("020", "tianqi", 13));

        for (Teacher teacher : treeSet) {
            System.out.println(teacher);
        }

    }
}
