package com.itheima.homework.T6;

import java.util.InputMismatchException;

/**
 * 自定义一个键盘输入的工具类,提供3个静态方法,分别完成让用户输入整数,小数,和字符串的功能,且当用户输入错误的时候,不能结束程序,要给用户重新输入的机会;
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Util.getInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入有误，请输入整数");
            }
        }

        while (true) {
            try {
                Util.getDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入有误，请输入小数");
            }
        }

        while (true) {
            try {
                Util.getString();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入有误，请输入字符串");
            }
        }
    }
}
