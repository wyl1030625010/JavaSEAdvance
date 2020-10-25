package com.itheima.homework.T2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目录IOTest,
 * 之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("day12\\src\\com\\itheima\\homework\\file\\T1.txt");

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("day12\\src\\com\\itheima\\homework\\file\\IOTest\\T1.txt");

        int len;
        byte[] bytes = new byte[8193];

        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fis.close();
        fos.close();
    }
}
