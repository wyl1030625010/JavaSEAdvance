package com.itheima.homework;

public class T2 {
    public static void main(String[] args) {
        Outside2 outside2 = new Outside2();
        outside2.show();
    }
}

class Outside2 {

    public void show() {
        int a = 10;
        class Inside {
            public void show() {
                System.out.println("a = " + a);//10
            }
        }
        Inside in = new Inside();
        in.show();
    }
}