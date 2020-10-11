package com.itheima.homework.T4;

public class MotorVehicles {
    private String brand;
    private Double price;

    public  void run(){
        System.out.println("ÔËÐÐ");
    }

    public MotorVehicles() {
    }

    public MotorVehicles(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }
}
