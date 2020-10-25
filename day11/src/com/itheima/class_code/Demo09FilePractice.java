package com.itheima.class_code;

import java.io.File;
import java.io.IOException;

public class Demo09FilePractice {
    public static void main(String[] args) throws IOException {
        String basePath = "day11\\src\\com\\itheima\\class_code\\file";

        File aa = new File(basePath, "aa");
        if (!aa.exists()) {
            aa.mkdirs();
        }

        File file = new File(aa, "aa.txt");
        file.createNewFile();
    }
}
