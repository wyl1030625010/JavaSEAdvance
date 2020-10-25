package com.itheima.class_code;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 */
public class Demo08File {
    public static void main(String[] args) throws IOException {
        String basePath = "G:\\heima\\JavaAdvance\\JavaSEAdvance\\day11\\src\\com\\ithteima\\class_code\\file";

        //mkdir 创建单层目录
        //method1(basePath);

        //mkdirs 创建多层目录
        //method2(basePath);

        //createNewFile(); 创建文件
        //method3(basePath);

        //remove 删除
        //删除不走回收站
        //只能删除文件或者空的文件夹
        // method04(basePath);

        //判断
        //method05(basePath);


        //遍历文件夹 返回该文件夹中所有的文件和文件夹
        //当调用者是文件时，出现空指针异常
        File file = new File("E:\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void method05(String basePath) {
        File file = new File(basePath, "aaa.txt");
        //判断是否是文件
        System.out.println(file.isFile());
        //判断是否是是文件夹
        System.out.println(file.isDirectory());
        //判断是否存在
        System.out.println(file.exists());
        //如果是文件，返回文件名加后缀名
        //如果是文件夹，返回文件名
        System.out.println(file.getName());
    }

    private static void method04(String basePath) {
        File file = new File(basePath, "aaa.txt");
        boolean delete = file.delete();
        System.out.println(delete);
    }

    private static void method2(String basePath) {
        File file = new File(basePath, "aaa\\bb\\cc");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
    }

    private static void method3(String basePath) throws IOException {
        File file = new File(basePath, "aaa.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }

    private static void method1(String basePath) {
        File file = new File(basePath, "aaa");
        System.out.println(file);
        boolean mkdirs = file.mkdir();
        System.out.println(mkdirs);
    }
}

