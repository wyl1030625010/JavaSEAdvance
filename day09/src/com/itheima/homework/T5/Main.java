package com.itheima.homework.T5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 会员注册:会员信息包括(会员号，姓名，电话，身份证号),其中会员号和身份证号不能重复。
 * <p>
 * 要求:
 * <p>
 * 1.控制台输入会员信息,其中会员号随机产生3位数字
 * <p>
 * 2.如果输入会员或身份证号重复时不保存，并给出提示会员号重复或身份证号重复
 * <p>
 * 3.输入三个会员信息，添加到集合中按会员号进行升序排序
 */
public class Main {
    public static void main(String[] args) {
        new Add().start();
    }
}
