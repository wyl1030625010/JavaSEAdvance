package com.itheima.class_code;

public class TestSwimming {
    public static void main(String[] args) {
        goSwimming(name -> {
            return name + "ȥ��Ӿ";
        });
    }

    public static void goSwimming(Swim swim) {
        String swimming = swim.swimming("����");
        System.out.println(swimming);
    }
}

interface Swim {
    String swimming(String name);
}


