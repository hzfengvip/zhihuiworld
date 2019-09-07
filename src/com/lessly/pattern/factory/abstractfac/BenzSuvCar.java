package com.lessly.pattern.factory.abstractfac;

/**
 * 具体产品：奔驰suv
 */
public class BenzSuvCar extends BenZCar{

    private String type = "SUV";

    public String type() {
        return type;
    }
}
