package com.itheima.code_extends.Demo01.dao;

import com.itheima.code_extends.Demo01.domain.Teacher;

import java.util.ArrayList;

public class TeacherDAO {

    private ArrayList<Teacher> list = new ArrayList();

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
        for (int i = 0; i < list.size(); i++) {
            Teacher tea = list.get(i);
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
