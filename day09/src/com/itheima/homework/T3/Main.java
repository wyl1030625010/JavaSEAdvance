package com.itheima.homework.T3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;


/**
 * 键盘输入3本书按照价格从低到高排序后输出,如果价格相同则按照书名的自然顺序排序;
 * <p>
 * **要求:**
 * <p>
 * 1:书以对象形式存在,包含书名和价格(int类型)两个属性;
 * <p>
 * 2:要求即使直接打印书对象的时候,也能看到书的名称和价格,而不是书对象的地址值;
 * <p>
 * 3:分别使用自然排序和比较器排序实现效果;
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
