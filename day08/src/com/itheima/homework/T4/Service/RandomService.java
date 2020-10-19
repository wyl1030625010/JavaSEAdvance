package com.itheima.homework.T4.Service;

import com.itheima.homework.T4.DAO.RandomDAO;

public class RandomService {
    public void random() {
        RandomDAO dao = new RandomDAO();
        System.out.println(dao.random());
    }
}
