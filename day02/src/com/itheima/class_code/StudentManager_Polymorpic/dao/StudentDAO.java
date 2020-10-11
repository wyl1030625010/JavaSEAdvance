package com.itheima.class_code.StudentManager_Polymorpic.dao;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.ArrayList;

public class StudentDAO {

    private ArrayList<Student> list = new ArrayList();

    /**
     * ���ѧ������
     *
     * @param stu ����ӵ�ѧ������
     */

    public boolean addStudent(Student stu) {
        return list.add(stu);
    }

    /**
     * ��ѯ����ѧ��
     */
    public ArrayList<Student> findAllStudent() {
        return list;
    }

    /**
     * ɾ��ѧ������
     *
     * @param id ɾ����id
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
     * �޸ĸ�id�Ķ�������
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
