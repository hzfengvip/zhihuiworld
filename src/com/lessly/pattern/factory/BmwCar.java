package com.lessly.pattern.factory;


/**
 * 具体产品2
 */
public class BmwCar implements Car{

    private String name;
    private String color;

    public String getName() {
        return "宝马";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return "蓝色";
    }

    public void setColor(String color) {
        this.color = color;
    }
}
