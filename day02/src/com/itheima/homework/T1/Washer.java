package com.itheima.homework.T1;

public class Washer extends ElectricAppliance {
    private String motorType;
    private String washingCapacity;

    @Override
    public String toString() {
        return "Washer{" +
                "motorType='" + motorType + '\'' +
                ", washingCapacity='" + washingCapacity + '\'' +
                '}';
    }

    public Washer() {
    }

    public Washer(String motorType, String washingCapacity) {
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    public Washer(String brand, String type, String color, Double price, String motorType, String washingCapacity) {
        super(brand, type, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}
