package com.itheima.code_extends.Demo01.service;

import com.itheima.code_extends.Demo01.dao.TeacherDAO;
import com.itheima.code_extends.Demo01.domain.Teacher;

import java.util.ArrayList;

public class TeacherService {
    private static TeacherDAO teacherDAO = new TeacherDAO();

    /**
     * ɾ����ʦ
     *
     * @param id ���ݸ�idɾ������
     */
    public void delTeacher(Integer id) {
        boolean flag = teacherDAO.delTeacher(id);
        if (flag) {
            System.out.println("ɾ���ɹ�");
        } else {
            System.out.println("ɾ��ʧ��");
        }
    }

    /**
     * ��ѯ������ʦ
     *
     * @return
     */
    public static ArrayList<Teacher> findAllTeacher() {
        return teacherDAO.findAllTeacher();
    }

    /**
     * �����ʦ
     *
     * @param tea �½�������ʦ����
     */
    public void addTeacher(Teacher tea) {
        boolean flag = teacherDAO.addTeacher(tea);

        if (flag) {
            System.out.println("��ӳɹ�");
        } else {
            System.out.println("���ʧ��");
        }
    }

    /**
     * �޸���ʦ��Ϣ
     */
    public void editTeacher(Teacher teacher) {
        boolean flag = teacherDAO.editTeacher(teacher);
        if (flag) {
            System.out.println("�޸ĳɹ�");
        } else {
            System.out.println("�޸�ʧ��");
        }
    }

    /**
     * �ж��������id�Ƿ����
     *
     * @param id ��Ҫ�ж��Ƿ���ڵ���id
     * @return ���ڷ���true�������ڷ���false
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

