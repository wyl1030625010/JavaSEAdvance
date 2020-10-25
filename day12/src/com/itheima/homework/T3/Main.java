package com.itheima.homework.T3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 图片加密，利用的是异或原理（位运算的一种如果两个数相同结果为0，不同为1)实现
 * <p>
 * 提示:一个数，连续和另一个数字（这个数字就可以称之为密钥）异或两次就会变回自己本身
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("day12\\src\\file\\a.png");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("day12\\src\\file\\a(1).png");

        int len;
        byte[] bytes = new byte[8193];

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入密钥：");
        int input = sc.nextInt();

        while ((len = fis.read(bytes)) != -1) {
            byte[] save = new byte[len];

            for (int i = 0; i < len; i++) {
                //数字加密
                save[i] = (byte) (bytes[i] ^ 1 ^ input);
            }

            fos.write(save, 0, save.length);
        }

        fis.close();
        fos.close();
    }
}
