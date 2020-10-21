package com.itheima.homework.T1;

import java.util.HashSet;

/**
 * 假如你有3个室友,请使用HashSet集合保存3个室友的信息;
 * <p>
 * 信息如下:
 * <p>
 * 赵丽颖,18
 * <p>
 * 范冰冰,20
 * <p>
 * 杨幂,19
 * <p>
 * **要求:**
 * <p>
 * 1:室友以对象形式存在,包含姓名和年龄两个属性;
 * <p>
 * 2:使用代码保证集合中同名同年龄的对象只有一份;(相同姓名和年龄的对象认为是同一个对象)
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Roomie> set = new HashSet<>();
        set.add(new Roomie("赵丽颖", 18));
        set.add(new Roomie("范冰冰", 20));
        set.add(new Roomie("杨幂", 19));
        
        System.out.println(set);
    }
}
