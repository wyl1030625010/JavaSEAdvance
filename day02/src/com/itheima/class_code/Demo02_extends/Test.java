package com.itheima.class_code.Demo02_extends;

public class Test {
    public static void main(String[] args) {
        //构造方法不能继承
        //创建子类对象，必先创建父类对象
        ZI qwe = new ZI("qwe");
        String str = qwe.str;
        System.out.println(str);
    }
}
