package com.itheima.homework.T1;

public class TV extends ElectricAppliance {
    private String screenSize;
    private String resolutionRatio;

    @Override
    public String toString() {
        return "TV{" +
                "screenSize='" + screenSize + '\'' +
                ", resolutionRatio='" + resolutionRatio + '\'' +
                '}';
    }

    public TV() {
    }

    public TV(String screenSize, String resolutionRatio) {
        this.screenSize = screenSize;
        this.resolutionRatio = resolutionRatio;
    }

    public TV(String brand, String type, String color, Double price, String screenSize, String resolutionRatio) {
        super(brand, type, color, price);
        this.screenSize = screenSize;
        this.resolutionRatio = resolutionRatio;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }
}
