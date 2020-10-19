package com.itheima.homework.T5;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * 2.����MyQueue�࣬�Զ�����У��ص�:�Ƚ��ȳ���,�����add(Object obj)��get()������
 * <p>
 * ��ʾ:ʹ��������ģ��
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
