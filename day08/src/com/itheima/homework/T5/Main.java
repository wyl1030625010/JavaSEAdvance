package com.itheima.homework.T5;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add("a");
        myQueue.add(4);
        System.out.println(myQueue.toString());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
    }
}
