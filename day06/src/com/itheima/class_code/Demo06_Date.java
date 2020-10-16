package com.itheima.class_code;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo06_Date {
    public static void main(String[] args) {
        String jia = "2020��11��11�� 0:03:47";
        String pi = "2020��11��11�� 0:10:11";

        check(jia);
        check(pi);
    }

    private static void check(String time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        try {
            long time1 = simpleDateFormat.parse(time).getTime();
            long startTime = simpleDateFormat.parse("2020��11��11�� 0:0:0").getTime();
            long endTime = simpleDateFormat.parse("2020��11��11�� 0:10:0").getTime();

            if (time1 > startTime && time1 < endTime) {
                System.out.println("��ɱ�ɹ�");
            } else {
                System.out.println("��ɱʧ��");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
