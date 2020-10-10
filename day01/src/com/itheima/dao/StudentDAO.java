package com.itheima.dao;

import com.itheima.domain.Student;

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
     * @param id �޸ĸ�id�Ķ�������
     */
    public boolean editStudent(Integer id, String newName, Integer newAge, String newBirthday) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                stu.setName(newName);
                stu.setAge(newAge);
                stu.setBirthday(newBirthday);

                return true;
            }
        }
        return false;
    }
}
