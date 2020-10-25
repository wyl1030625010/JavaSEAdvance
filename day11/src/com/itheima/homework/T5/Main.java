package com.itheima.homework.T5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 1.键盘录入3个学生信息,存储到学生对象(姓名,年龄).然后添加到ArrayList集合中.
 * 2.键盘录入3个居住地信息,添加到另一个集合ArrayList;
 * 3.把两个list集合中的数据收集到同一个map集合中,键是学生对对象,值是居住地址.
 * 4.要求map集合中不能存在相同的学生信息.并按照学生年龄降序排列
 * <p>
 * 5.使用Stream流输出集合中所有姓张的人信息;
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<String> address = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生信息：");
            String msg = sc.next();
            String[] split = msg.split("，");
            students.add(new Student(split[0], Integer.parseInt(split[1])));
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入第" + (i + 1) + "个地址：");
            address.add(sc.next());
        }

        System.out.println();

        TreeMap<Student, String> treeMap = new TreeMap<>();

        for (int i = 0; i < 3; i++) {
            treeMap.put(students.get(i), address.get(i));
        }

        Set<Student> keySet = treeMap.keySet();
        keySet.stream().filter(student -> student.getName().startsWith("张")).forEach(System.out::println);
    }
}
