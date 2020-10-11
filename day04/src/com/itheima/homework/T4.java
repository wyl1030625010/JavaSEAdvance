package com.itheima.homework;

/**
 * 给定一个导演 Director接口，内含唯一的抽象方法makeMovie，且无参数、无返回值，请使用lambda表达式在Test中补全代码完成调用,打印输出“导演拍电影啦！”字样
 */
public class T4 {
    public static void main(String[] args) {
        //请使用Lambda和省略格式调用invokeDirect方法,打印输出“导演拍电影啦！”字样
        invokeDirect(() -> System.out.println("导演拍电影啦！"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();

    }
}

interface Director {
    void makeMovie();
}

