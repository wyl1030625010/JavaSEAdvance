package com.itheima.homework.T7;

public class Computer {

    public void open() {
        System.out.println("����");
    }

    public void close() {
        System.out.println("�ػ�");
    }

    public void useUSB(USB usb) {
        usb.connet();
        usb.disconnet();
    }

//    public void useMouse() {
//        Mouse mouse = new Mouse();
//        mouse.connet();
//        mouse.disconnet();
//    }
//
//    public void useKeyboard() {
//        Keyboard keyBoard = new Keyboard();
//        keyBoard.connet();
//        keyBoard.disconnet();
//    }
}
