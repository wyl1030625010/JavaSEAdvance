package com.itheima.code_extends.Demo03;

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
