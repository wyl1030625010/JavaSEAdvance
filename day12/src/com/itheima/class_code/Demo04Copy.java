package com.itheima.class_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04Copy {
    public static void main(String[] args) throws IOException {
        String basePath = "day12\\src\\file\\a.png";

        FileInputStream fileInputStream = new FileInputStream(basePath);

        FileOutputStream fileOutputStream = new FileOutputStream("day12\\src\\file\\a(1).png");

        int b;
        byte[] buffer = new byte[1024];

        while ((b = fileInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, b);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }


}
