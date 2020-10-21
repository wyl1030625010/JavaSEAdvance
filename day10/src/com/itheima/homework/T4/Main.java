package com.itheima.homework.T4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 编写Java程序，创建3个ArrayList对象，每个对象中添加学员的姓名.再创建HashMap对象，以年级为键，
 * 存放学员的ArrayList为值。然后从HashMap对象中取出某个班级的学员信息并输出
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> class1 = new ArrayList<>();
        class1.add(new Student("张三", 85));
        class1.add(new Student("四三", 90));
        class1.add(new Student("王五", 61));

        HashMap<String, ArrayList<Student>> hashMap = new HashMap<>();
        hashMap.put("java1班", class1);

        hashMap.forEach((key, value) -> {
            System.out.println(key + "的");
            for (Student student : value) {
                System.out.println(student);
            }
        });
    }
}
