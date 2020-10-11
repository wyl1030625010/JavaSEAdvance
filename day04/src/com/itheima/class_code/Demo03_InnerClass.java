package com.itheima.class_code;


public class Demo03_InnerClass {
    public static void main(String[] args) {
        /*
        匿名内部类
        父类是CatInter，但这个类本身没有名字
        这个对象被保存到变量cat中
         */
        CatInter cat = new CatInter() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };

        cat.eat();
    }
}

interface CatInter {
    void eat();
}