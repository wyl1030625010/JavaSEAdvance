package com.itheima.homework.T3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * ͼƬ���ܣ����õ������ԭ��λ�����һ�������������ͬ���Ϊ0����ͬΪ1)ʵ��
 * <p>
 * ��ʾ:һ��������������һ�����֣�������־Ϳ��Գ�֮Ϊ��Կ��������ξͻ����Լ�����
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("day12\\src\\file\\a.png");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("day12\\src\\file\\a(1).png");

        int len;
        byte[] bytes = new byte[8193];

        Scanner sc = new Scanner(System.in);
        System.out.print("��������Կ��");
        int input = sc.nextInt();

        while ((len = fis.read(bytes)) != -1) {
            byte[] save = new byte[len];

            for (int i = 0; i < len; i++) {
                //���ּ���
                save[i] = (byte) (bytes[i] ^ 1 ^ input);
            }

            fos.write(save, 0, save.length);
        }

        fis.close();
        fos.close();
    }
}
