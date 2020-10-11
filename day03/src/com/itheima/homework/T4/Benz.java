package com.itheima.homework.T4;

public class Benz extends MotorVehicles implements GPS {

    public Benz() {
    }

    public Benz(String brand, Double price) {
        super(brand, price);
    }

    @Override
    public void location() {
        System.out.println("GPS");
    }
}
