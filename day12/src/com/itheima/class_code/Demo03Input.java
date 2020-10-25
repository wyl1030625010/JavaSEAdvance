package com.itheima.class_code;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Administrator
 */
public class Demo03Input {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("day12\\src\\file\\a.txt");

        int b;

        //当读不到数据时，返回-1，以此判断循环结束
        while ((b = fileInputStream.read()) != -1) {
            System.out.print((char) b);
        }
    }
}
