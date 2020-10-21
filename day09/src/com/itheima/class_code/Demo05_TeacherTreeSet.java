package com.itheima.class_code;

import java.util.Comparator;
import java.util.TreeSet;


public class Demo05_TeacherTreeSet {
    public static void main(String[] args) {
        //TreeSet(Comparator<? super E> comparator) 构造一个新的、空的树集，根据指定的比较器进行排序。
        //Lambda表达式
        TreeSet<Teacher> treeSet = new TreeSet<>((o1, o2) -> {
            //首要条件
            //根据年龄进行排序
            int recult = o1.getAge() - o2.getAge();

            //次要条件
            //当集合中年龄相等时，根据ASCII码依从首字母开始次判断姓名中的字母，字母靠前的排左边，靠后的排右边
            recult = recult == 0 ? o1.getName().compareTo(o2.getName()) : recult;

            return recult;
        });

      /*
      //匿名内部类
      TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //首要条件
                //根据年龄进行排序
                int recult = o1.getAge() - o2.getAge();

                //次要条件
                //当集合中年龄相等时，根据ASCII码依从首字母开始次判断姓名中的字母，字母靠前的排左边，靠后的排右边
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
