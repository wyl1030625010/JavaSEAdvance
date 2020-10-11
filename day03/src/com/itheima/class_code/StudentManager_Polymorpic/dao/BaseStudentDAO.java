package com.itheima.class_code.StudentManager_Polymorpic.dao;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.ArrayList;

public interface BaseStudentDAO {
    /**
     * ���ѧ������
     *
     * @param stu ����ӵ�ѧ������
     */
    public abstract boolean addStudent(Student stu);

    /**
     * ��ѯ����ѧ��
     */
    public abstract ArrayList<Student> findAllStudent();

    /**
     * ɾ��ѧ������
     *
     * @param id ɾ����id
     */
    public abstract boolean delStudent(Integer id);

    /**
     * �޸ĸ�id�Ķ�������
     */
    public abstract boolean editStudent(Student newStu);
}
