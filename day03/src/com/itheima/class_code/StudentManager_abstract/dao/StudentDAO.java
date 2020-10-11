package com.itheima.class_code.StudentManager_abstract.dao;

import com.itheima.class_code.StudentManager_abstract.domain.Student;

import java.util.ArrayList;

public class StudentDAO extends BaseStudentDAO {
    private static ArrayList<Student> list = new ArrayList<>();

    static {
        list.add(new Student(1001, "张三", 23, "1996-10-14"));
        list.add(new Student(1002, "李四", 24, "1997-09-15"));
        list.add(new Student(1002, "王五", 25, "1998-08-16"));
    }

    /**
     * 添加学生操作
     *
     * @param stu 新添加的学生对象
     */

    public boolean addStudent(Student stu) {
        return list.add(stu);
    }

    /**
     * 查询所有学生
     */
    public ArrayList<Student> findAllStudent() {
        return list;
    }

    /**
     * 删除学生操作
     *
     * @param id 删除的id
     */
    public boolean delStudent(Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return list.remove(list.get(i));
            }
        }
        return false;
    }

    /**
     * 修改该id的对象属性
     */
    public boolean editStudent(Student newStu) {
        for (Student stu : list) {
            if (stu.getId().equals(newStu.getId())) {
                stu.setName(newStu.getName());
                stu.setAge(newStu.getAge());
                stu.setBirthday(newStu.getBirthday());
                return true;
            }
        }
        return false;
    }
}
