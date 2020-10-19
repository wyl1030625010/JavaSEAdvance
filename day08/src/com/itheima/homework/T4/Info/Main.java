package com.itheima.homework.T4.Info;

import com.itheima.homework.T4.Controller.RandomController;

/**
 * 1.模拟随机点名系统
 * <p>
 * 要求:
 * <p>
 * 1.项目启动时，提示用户是否进行随机点名，如果输入yes，随机显示出学生学号和姓名
 * <p>
 * 2.显示完学生信息后，提示是否继续点名，除非输入no，否则可以多次随机点名
 * <p>
 */
public class Main {
    public static void main(String[] args) {
        new RandomController().start();
    }
}
