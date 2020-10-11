package com.itheima.class_code.StudentManager_Polymorpic.dao;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.ArrayList;

public class StudentDAO {

    private ArrayList<Student> list = new ArrayList();

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
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
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
