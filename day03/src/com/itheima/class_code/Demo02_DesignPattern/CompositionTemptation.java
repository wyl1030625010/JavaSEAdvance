package com.itheima.class_code.Demo02_DesignPattern;

public abstract class CompositionTemptation {
    /**
     * 创建作文模板
     * 模板方法一般不会轻易改动
     * final修饰的类不能被子类继承
     */
    public final void writ() {
        System.out.println("《作文题目》");

        body();

        System.out.println("作文街结尾");
    }


    /**
     * 抽象方法创建作文身体
     */
    public abstract void body();
}
