package com.itheima.homework.T8;

public class GirlFriend extends Person {
    public void cook() {
        System.out.println("做饭");
    }

    public void washClothes(Clothe clothe) {
        System.out.println("洗" + clothe.getBrand() + "的" + clothe.getColor() + "的" + "衣服");
    }

    public GirlFriend() {
    }

    public GirlFriend(String name, Integer hight) {
        super(name, hight);
    }
}
