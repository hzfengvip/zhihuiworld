package com.lessly.pattern.factory;


/**
 * 具体产品1
 */
public class BenZCar implements Car{

    private String name;
    private String color;

    public String getName() {
        return "奔驰";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return "白色";
    }

    public void setColor(String color) {
        this.color = color;
    }
}
