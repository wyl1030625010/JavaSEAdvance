package com.itheima.service;

import com.itheima.dao.StudentDAO;
import com.itheima.domain.Student;

import java.util.ArrayList;

public class StudentService {
    private static StudentDAO studentDAO = new StudentDAO();

    /**
     * ɾ��ѧ��
     *
     * @param id ���ݸ�idɾ������
     */
    public void delStudent(Integer id) {
        boolean flag = studentDAO.delStudent(id);
        if (flag) {
            System.out.println("ɾ���ɹ�");
        } else {
            System.out.println("ɾ��ʧ��");
        }
    }

    /**
     * ��ѯ����ѧ��
     *
     * @return
     */
    public static ArrayList<Student> findAllStudent() {
        return studentDAO.findAllStudent();
    }

    /**
     * ���ѧ��
     *
     * @param stu �½�����ѧ������
     */
    public void addStudent(Student stu) {
        boolean flag = studentDAO.addStudent(stu);

        if (flag) {
            System.out.println("��ӳɹ�");
        } else {
            System.out.println("���ʧ��");
        }
    }

    /**
     * �޸�ѧ����Ϣ
     * @param id Ҫɾ��ѧ����id
     * @param newName �޸ĵ�������
     * @param newAge �޸ĵ�������
     * @param newBirthday �޸ĵ�������
     */
    public void editStudent(Integer id, String newName, Integer newAge, String newBirthday) {
        boolean flag = studentDAO.editStudent(id, newName, newAge, newBirthday);
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
        ArrayList<Student> stus = studentDAO.findAllStudent();
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

}

