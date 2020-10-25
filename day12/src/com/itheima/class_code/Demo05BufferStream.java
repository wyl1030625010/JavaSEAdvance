package com.itheima.class_code;

import java.io.*;

public class Demo05BufferStream {
    public static void main(String[] args) throws IOException {
        String basePath = "day12\\src\\file\\a.png";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(basePath));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day12\\src\\file\\a(2).png"));

        int len;
        byte[] buffer = new byte[1024];

        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }

        bos.flush();

        bis.close();
        bos.close();
    }
}

