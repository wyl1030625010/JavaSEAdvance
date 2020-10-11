package com.itheima.class_code.Demo02_extends;

public class Fu {
    String str;

    public Fu(String str) {
        super();
        this.str = str;
        System.out.println("父类带参构造" + str);
    }

    public Fu() {
        super();
        System.out.println("父类空参构造");
    }
}
