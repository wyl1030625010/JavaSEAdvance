package com.itheima.homework.T7;

public class Keyboard implements USB {
    @Override
    public void connet() {
        System.out.println("键盘连接了");
    }

    @Override
    public void disconnet() {
        System.out.println("键盘断开了");
    }
}
