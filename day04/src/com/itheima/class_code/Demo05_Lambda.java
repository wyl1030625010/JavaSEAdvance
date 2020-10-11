package com.itheima.class_code;

public class Demo05_Lambda {
    public static void main(String[] args) {
        userStringHandler((String str) -> {
            System.out.println(str);
        });
    }

    public static void userStringHandler(StringHandler sh) {
        sh.show("带参数Lambda表达式");
    }
}

interface StringHandler {
    void show(String str);
}
