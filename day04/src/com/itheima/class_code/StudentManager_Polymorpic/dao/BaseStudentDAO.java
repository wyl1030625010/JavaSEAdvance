package com.itheima.class_code.StudentManager_Polymorpic.dao;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.ArrayList;

public interface BaseStudentDAO {
    /**
     * 添加学生操作
     *
     * @param stu 新添加的学生对象
     */
    public abstract boolean addStudent(Student stu);

    /**
     * 查询所有学生
     */
    public abstract ArrayList<Student> findAllStudent();

    /**
     * 删除学生操作
     *
     * @param id 删除的id
     */
    public abstract boolean delStudent(Integer id);

    /**
     * 修改该id的对象属性
     */
    public abstract boolean editStudent(Student newStu);
}
