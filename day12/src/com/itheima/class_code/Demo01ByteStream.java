package com.itheima.class_code;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 */
public class Demo01ByteStream {
    public static void main(String[] args) throws IOException {
        //创建字节流输出对象
        //如果文件不存在，自动创建
        //如果文件存在，则清空数据
        FileOutputStream fileOutputStream = new FileOutputStream("day12\\src\\file\\a.txt");

        //写数据
        //传递整数，得到的是该整数对应的ASCII表中的字符
        fileOutputStream.write(1);

        //换行
        //Windows \r\n
        //Lin  \n
        //Mac \r
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write('b');

        //关闭流
        //释放资源
        fileOutputStream.close();

        //append  续写开关 true表示续写
        FileOutputStream fileOutputStream1 = new FileOutputStream("day12\\src\\file\\b.txt", true);
        fileOutputStream1.write(1);
        fileOutputStream1.close();
    }
}
