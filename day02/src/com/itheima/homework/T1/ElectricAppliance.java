package com.itheima.homework.T1;

public class ElectricAppliance {
    private String brand;
    private String type;
    private String color;
    private Double price;

    @Override
    public String toString() {
        return "ElectricAppliance{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public ElectricAppliance() {
    }

    public ElectricAppliance(String brand, String type, String color, Double price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
