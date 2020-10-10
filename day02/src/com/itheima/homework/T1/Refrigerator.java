package com.itheima.homework.T1;

public class Refrigerator extends ElectricAppliance {
    private String doorStyle;
    private String refrigerationMode;

    @Override
    public String toString() {
        return "Refrigerator{" +
                "doorStyle='" + doorStyle + '\'' +
                ", refrigerationMode='" + refrigerationMode + '\'' +
                '}';
    }

    public Refrigerator() {
    }

    public Refrigerator(String doorStyle, String refrigerationMode) {
        this.doorStyle = doorStyle;
        this.refrigerationMode = refrigerationMode;
    }

    public Refrigerator(String brand, String type, String color, Double price, String doorStyle, String refrigerationMode) {
        super(brand, type, color, price);
        this.doorStyle = doorStyle;
        this.refrigerationMode = refrigerationMode;
    }

    public String getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String getRefrigerationMode() {
        return refrigerationMode;
    }

    public void setRefrigerationMode(String refrigerationMode) {
        this.refrigerationMode = refrigerationMode;
    }
}
