package com.itheima.class_code.StudentManager_Polymorpic.service;

import com.itheima.class_code.StudentManager_Polymorpic.dao.StudentDAO;
import com.itheima.class_code.StudentManager_Polymorpic.domain.Student;

import java.util.ArrayList;

public class StudentService {
    private static StudentDAO studentDAO = new StudentDAO();

    /**
     * 删除学生
     *
     * @param id 根据该id删除对象
     */
    public void delStudent(Integer id) {
        boolean flag = studentDAO.delStudent(id);
        if (flag) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    /**
     * 查询所有学生
     *
     * @return
     */
    public static ArrayList<Student> findAllStudent() {
        return studentDAO.findAllStudent();
    }

    /**
     * 添加学生
     *
     * @param stu 新建立的学生对象
     */
    public void addStudent(Student stu) {
        boolean flag = studentDAO.addStudent(stu);

        if (flag) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    /**
     * 修改学生信息
     */
    public void editStudent(Student student) {
        boolean flag = studentDAO.editStudent(student);
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
        ArrayList<Student> stus = studentDAO.findAllStudent();
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

}

