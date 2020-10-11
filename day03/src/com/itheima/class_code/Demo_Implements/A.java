package com.itheima.class_code.Demo_Implements;

public interface A {
    default void show() {
        System.out.println("show");
    }
}
