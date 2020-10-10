package com.itheima.code_extends.Demo01.dao;

import com.itheima.code_extends.Demo01.domain.Teacher;

import java.util.ArrayList;

public class TeacherDAO {

    private ArrayList<Teacher> list = new ArrayList();

    /**
     * 添加老师操作
     *
     * @param tea 新添加的老师对象
     */

    public boolean addTeacher(Teacher tea) {
        return list.add(tea);
    }

    /**
     * 查询所有老师
     */
    public ArrayList<Teacher> findAllTeacher() {
        return list;
    }

    /**
     * 删除老师操作
     *
     * @param id 删除的id
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
     * 修改该id的对象属性
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
