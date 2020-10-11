package com.itheima.class_code;

public class Demo04_Lambda {
    public static void main(String[] args) {
        //Lambda表达式格式 () -> {}
        userShowHandler(() -> System.out.println("Lambda表达式练习"));
    }

    public static void userShowHandler(ShowHandler sh) {
        sh.show();
        System.out.println("---------------------");
    }

}

interface ShowHandler {
    void show();
}
