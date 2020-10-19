package com.itheima.homework.T5;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * 2.创建MyQueue类，自定义队列（特点:先进先出）,有添加add(Object obj)和get()方法。
 * <p>
 * 提示:使用链表来模拟
 */
public class MyQueue<T> {
    private static LinkedList<Object> linkedList = new LinkedList<>();

    public MyQueue() {

    }

    public void add(Object o) {
        linkedList.addLast(o);
    }

    public T get() {
        T first = null;
        try {
            first = (T) linkedList.getFirst();
            linkedList.remove(first);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return first;
    }

    public String toString() {
        return "MyQueue" + linkedList;
    }

}
