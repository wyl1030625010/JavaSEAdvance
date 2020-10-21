package com.itheima.class_code.StudentManager_Polymorpic.dao;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.ArrayList;

public class StudentDAO implements BaseStudentDAO {
    private static ArrayList<Student> list = new ArrayList<>();

    static {
        list.add(new Student(1001, "����", 23, "1996-10-14"));
        list.add(new Student(1002, "����", 24, "1997-09-15"));
        list.add(new Student(1002, "����", 25, "1998-08-16"));
    }

    /**
     * ���ѧ������
     *
     * @param stu ����ӵ�ѧ������
     */
    @Override
    public boolean addStudent(Student stu) {
        return list.add(stu);
    }

    /**
     * ��ѯ����ѧ��
     */
    @Override
    public ArrayList<Student> findAllStudent() {
        return list;
    }

    /**
     * ɾ��ѧ������
     *
     * @param id ɾ����id
     */
    @Override
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
    @Override
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
