package com.itheima.homework.T7;

public class Keyboard implements USB {
    @Override
    public void connet() {
        System.out.println("����������");
    }

    @Override
    public void disconnet() {
        System.out.println("���̶Ͽ���");
    }
}
