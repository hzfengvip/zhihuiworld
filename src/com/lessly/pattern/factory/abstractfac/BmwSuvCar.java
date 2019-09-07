package com.lessly.pattern.factory.abstractfac;


/**
 * 具体产品：宝马suv
 */
public class BmwSuvCar extends BmwCar{

    private String type = "SUV";

    public String type() {
        return type;
    }
}
