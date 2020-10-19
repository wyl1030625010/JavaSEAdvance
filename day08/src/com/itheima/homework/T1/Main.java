package com.itheima.homework.T1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 请定义一个Collection类型的集合，存储以下字符串：
 * “JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
 * **要求:**
 * 请编程实现以下功能：
 * 使用迭代器遍历所有元素，并打印
 * 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
 * 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
 * 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
 * (注意：以上每个功能都单独写个方法，在main方法中逐个调用测试即可)
 */
public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");


        one(collection);
        System.out.println("-------------------------");
        two(collection);
        System.out.println("-------------------------");
        three(collection);
        System.out.println("-------------------------");
        fore(collection);
    }

    private static void fore(Collection<String> collection) {
        collection.removeIf(s -> s.contains("Oracle"));
        System.out.println(collection);
    }

    private static void three(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains("Java")) {
                System.out.println(next);
            }
        }
    }

    private static void two(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() < 10) {
                System.out.println(next);
            }
        }
    }

    private static void one(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
