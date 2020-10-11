package com.itheima.homework.T6;

public class Boos {
    public static void main(String[] args) {
        Dog dog = new Dog();
        arrange(dog);
    }

    /**
     * 将动物给员工
     *
     * @param an 要给的动物
     */
    public static void arrange(Animal an) {
        Employee employee = new Employee();
        employee.feeding(an);
    }
}
