package com.itheima.homework.T8;

public class GirlFriend extends Person {
    public void cook() {
        System.out.println("����");
    }

    public void washClothes(Clothe clothe) {
        System.out.println("ϴ" + clothe.getBrand() + "��" + clothe.getColor() + "��" + "�·�");
    }

    public GirlFriend() {
    }

    public GirlFriend(String name, Integer hight) {
        super(name, hight);
    }
}
