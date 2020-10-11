package com.itheima.homework.T8;

public class BoyFriend extends Person {
    public void makeMoney() {
        System.out.println("’ı«Æ");
    }

    public void shopping(GirlFriend girlFriend) {
        System.out.println("≈„" + girlFriend.getName() + "π‰Ω÷");
    }

    public BoyFriend() {
    }

    public BoyFriend(String name, Integer hight) {
        super(name, hight);
    }
}
