package com.itheima.homework.T3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;


/**
 * ��������3���鰴�ռ۸�ӵ͵�����������,����۸���ͬ������������Ȼ˳������;
 * <p>
 * **Ҫ��:**
 * <p>
 * 1:���Զ�����ʽ����,���������ͼ۸�(int����)��������;
 * <p>
 * 2:Ҫ��ʹֱ�Ӵ�ӡ������ʱ��,Ҳ�ܿ���������ƺͼ۸�,�����������ĵ�ֵַ;
 * <p>
 * 3:�ֱ�ʹ����Ȼ����ͱȽ�������ʵ��Ч��;
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Book> ts = new TreeSet<>(((o1, o2) -> {
            Double recult = o1.getPrice() - o2.getPrice();

            recult = recult == 0 ? (o1.getName().compareTo(o2.getName())) : recult;

            return recult.intValue();
        }));

        try {
            ts.add(new Book("CCC", sc.nextDouble()));
            ts.add(new Book("BBB", sc.nextDouble()));
            ts.add(new Book("AAA", sc.nextDouble()));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        System.out.println(ts);
    }
}
