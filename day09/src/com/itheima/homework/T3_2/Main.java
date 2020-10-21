package com.itheima.homework.T3_2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Book> ts = new TreeSet<>();

        try {
            ts.add(new Book("CCC", sc.nextInt()));
            ts.add(new Book("BBB", sc.nextInt()));
            ts.add(new Book("AAA", sc.nextInt()));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        System.out.println(ts);
    }
}
