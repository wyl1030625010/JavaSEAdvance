package com.itheima.class_code;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 */
public class Demo01ByteStream {
    public static void main(String[] args) throws IOException {
        //�����ֽ����������
        //����ļ������ڣ��Զ�����
        //����ļ����ڣ����������
        FileOutputStream fileOutputStream = new FileOutputStream("day12\\src\\file\\a.txt");

        //д����
        //�����������õ����Ǹ�������Ӧ��ASCII���е��ַ�
        fileOutputStream.write(1);

        //����
        //Windows \r\n
        //Lin  \n
        //Mac \r
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write('b');

        //�ر���
        //�ͷ���Դ
        fileOutputStream.close();

        //append  ��д���� true��ʾ��д
        FileOutputStream fileOutputStream1 = new FileOutputStream("day12\\src\\file\\b.txt", true);
        fileOutputStream1.write(1);
        fileOutputStream1.close();
    }
}
