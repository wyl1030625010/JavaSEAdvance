package com.itheima.homework.T7;

public class Mouse implements USB {
    @Override
    public void connet() {
        System.out.println("鼠标连接了");
    }

    @Override
    public void disconnet() {
        System.out.println("鼠标断开了");
    }
}
