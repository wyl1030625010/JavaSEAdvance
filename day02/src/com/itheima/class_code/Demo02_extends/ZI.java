package com.itheima.class_code.Demo02_extends;

public class ZI extends Fu {
    String str;

    public ZI(String str) {
        super("asd");
        this.str = str;
        System.out.println("子类带参构造。。。。。。。。");
    }

    public ZI() {
        super();
        System.out.println("子类空参构造。。。。。。。。");
    }
}
