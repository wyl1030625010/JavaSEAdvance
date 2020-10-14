package com.itheima.class_code;

public class TestSwimming {
    public static void main(String[] args) {
        goSwimming(name -> {
            return name + "去游泳";
        });
    }

    public static void goSwimming(Swim swim) {
        String swimming = swim.swimming("张三");
        System.out.println(swimming);
    }
}

interface Swim {
    String swimming(String name);
}


