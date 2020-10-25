package com.itheima.homework.T1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.TreeMap;

/**
 * 统计一个文件calcCharNum.txt（见附件）中各个字母出现次数：
 * A(8),B(16),C(10)...,a(12),b(10),c(3)....，括号内代表字符出现次数;
 * <p>
 * 程序分析：
 * 1.这里没中文字符，依然可以只用字节流来读取文件
 * 2.不能保存相同的主键值，可以使用HashMap：key-value来实现
 * 3.先获得该key的value，如果存在key的话value的值加1
 * *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("day12\\src\\com\\itheima\\homework\\file\\T1.txt");

        FileInputStream fis = new FileInputStream(file);

        TreeMap<Character, Integer> hm = new TreeMap<>();

        count(fis, hm);

        fis.close();

        System.out.println(hm);
    }

    private static void count(FileInputStream fis, TreeMap<Character, Integer> hm) throws IOException {
        int b;

        while ((b = fis.read()) != -1) {
            char newB = (char) b;
            boolean control = newB >= 'a' && newB <= 'z' || newB >= 'A' && newB <= 'Z';

            if (control) {
                if (hm.containsKey(newB)) {
                    hm.put(newB, hm.get(newB) + 1);
                } else {
                    hm.put(newB, 1);
                }
            }
        }

        fis.close();
    }
}
