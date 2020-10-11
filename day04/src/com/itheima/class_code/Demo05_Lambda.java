package com.itheima.class_code;

public class Demo05_Lambda {
    public static void main(String[] args) {
        userStringHandler((String str) -> {
            System.out.println(str);
        });
    }

    public static void userStringHandler(StringHandler sh) {
        sh.show("������Lambda���ʽ");
    }
}

interface StringHandler {
    void show(String str);
}
