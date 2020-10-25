package com.itheima.class_code;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 */
public class Demo08File {
    public static void main(String[] args) throws IOException {
        String basePath = "G:\\heima\\JavaAdvance\\JavaSEAdvance\\day11\\src\\com\\ithteima\\class_code\\file";

        //mkdir ��������Ŀ¼
        //method1(basePath);

        //mkdirs �������Ŀ¼
        //method2(basePath);

        //createNewFile(); �����ļ�
        //method3(basePath);

        //remove ɾ��
        //ɾ�����߻���վ
        //ֻ��ɾ���ļ����߿յ��ļ���
        // method04(basePath);

        //�ж�
        //method05(basePath);


        //�����ļ��� ���ظ��ļ��������е��ļ����ļ���
        //�����������ļ�ʱ�����ֿ�ָ���쳣
        File file = new File("E:\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void method05(String basePath) {
        File file = new File(basePath, "aaa.txt");
        //�ж��Ƿ����ļ�
        System.out.println(file.isFile());
        //�ж��Ƿ������ļ���
        System.out.println(file.isDirectory());
        //�ж��Ƿ����
        System.out.println(file.exists());
        //������ļ��������ļ����Ӻ�׺��
        //������ļ��У������ļ���
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

