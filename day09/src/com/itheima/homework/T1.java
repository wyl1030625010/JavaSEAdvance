package com.itheima.homework;

import java.util.Arrays;
import java.util.HashSet;

/**
 * ��֪������Ϣ����:
 * <p>
 * {2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6}
 * <p>
 * ��ʹ�ô����ҳ����������е����е�����,Ҫ���ظ�������ֻ�ܱ���һ��;
 * <p>
 * **Ҫ��:**
 * <p>
 * ʹ��HashSet����ʵ��;
 */
public class T1 {
    public static void main(String[] args) {
        Double[] arr = {2.2, 5.5, 6.6, 2.2, 8.8, 1.1, 2.2, 8.8, 5.5, 2.2, 6.6};

        HashSet<Double> hs = new HashSet<>(Arrays.asList(arr));

        System.out.println(hs);
    }
}
