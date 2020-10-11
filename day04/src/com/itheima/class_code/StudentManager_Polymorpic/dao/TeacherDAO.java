package com.itheima.class_code.StudentManager_Polymorpic.dao;

import com.itheima.class_code.StudentManager_Polymorpic.domain.Teacher;

import java.util.ArrayList;

public class TeacherDAO {

    private static ArrayList<Teacher> list = new ArrayList();

    static {
        list.add(new Teacher(1001, "����", 23, "1996-10-14"));
        list.add(new Teacher(1002, "����", 24, "1997-09-15"));
        list.add(new Teacher(1002, "����", 25, "1998-08-16"));
    }

    /**
     * �����ʦ����
     *
     * @param tea ����ӵ���ʦ����
     */

    public boolean addTeacher(Teacher tea) {
        return list.add(tea);
    }

    /**
     * ��ѯ������ʦ
     */
    public ArrayList<Teacher> findAllTeacher() {
        return list;
    }

    /**
     * ɾ����ʦ����
     *
     * @param id ɾ����id
     */
    public boolean delTeacher(Integer id) {
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
    public boolean editTeacher(Teacher newTea) {
        for (Teacher tea : list) {
            if (tea.getId().equals(newTea.getId())) {
                tea.setName(newTea.getName());
                tea.setAge(newTea.getAge());
                tea.setBirthday(newTea.getBirthday());

                return true;
            }
        }
        return false;
    }
}
