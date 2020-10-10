package com.itheima.code_extends.Demo01.service;

import com.itheima.code_extends.Demo01.dao.TeacherDAO;
import com.itheima.code_extends.Demo01.domain.Teacher;

import java.util.ArrayList;

public class TeacherService {
    private static TeacherDAO teacherDAO = new TeacherDAO();

    /**
     * 删除老师
     *
     * @param id 根据该id删除对象
     */
    public void delTeacher(Integer id) {
        boolean flag = teacherDAO.delTeacher(id);
        if (flag) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    /**
     * 查询所有老师
     *
     * @return
     */
    public static ArrayList<Teacher> findAllTeacher() {
        return teacherDAO.findAllTeacher();
    }

    /**
     * 添加老师
     *
     * @param tea 新建立的老师对象
     */
    public void addTeacher(Teacher tea) {
        boolean flag = teacherDAO.addTeacher(tea);

        if (flag) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    /**
     * 修改老师信息
     */
    public void editTeacher(Teacher teacher) {
        boolean flag = teacherDAO.editTeacher(teacher);
        if (flag) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    /**
     * 判断新输入的id是否存在
     *
     * @param id 需要判断是否存在的新id
     * @return 存在返回true，不存在返回false
     */
    public boolean isExists(Integer id) {
        ArrayList<Teacher> stus = teacherDAO.findAllTeacher();
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

}

