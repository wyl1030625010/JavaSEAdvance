package com.itheima.class_code;

public class Demo03_Object {
    public static void main(String[] args) {
        String str = "asd";
        StringBuilder sb = new StringBuilder("asd");

        System.out.println(str.equals(sb));
        System.out.println(sb.equals(str));

    }
}
