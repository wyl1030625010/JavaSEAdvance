package com.itheima.class_code;

public class Demo04_Lambda {
    public static void main(String[] args) {
        //Lambda���ʽ��ʽ () -> {}
        userShowHandler(() -> System.out.println("Lambda���ʽ��ϰ"));
    }

    public static void userShowHandler(ShowHandler sh) {
        sh.show();
        System.out.println("---------------------");
    }

}

interface ShowHandler {
    void show();
}
