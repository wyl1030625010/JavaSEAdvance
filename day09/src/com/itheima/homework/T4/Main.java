package com.itheima.homework.T4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 编写Java程序，创建3个ArrayList对象，每个对象中添加学员的姓名.再创建HashMap对象，以年级为键，
 * 存放学员的ArrayList为值。然后从HashMap对象中取出某个班级的学员信息并输出
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> stu1 = new ArrayList<>();
        stu1.add(new Student("张三", 85));

        ArrayList<Student> stu2 = new ArrayList<>();
        stu2.add(new Student("李四", 90));

        ArrayList<Student> stu3 = new ArrayList<>();
        stu3.add(new Student("王五", 61));

        HashMap<String, ArrayList<Student>> hm = new HashMap<>();

        hm.put("Java1", stu1);
        hm.put("Java2", stu2);
        hm.put("Java3", stu3);

        System.out.println(hm);

    }
}
