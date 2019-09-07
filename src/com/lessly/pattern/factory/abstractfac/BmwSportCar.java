package com.lessly.pattern.factory.abstractfac;


/**
 * 具体产品：宝马跑车
 */
public class BmwSportCar extends BmwCar{


    private String type = "跑车";

    public String type() {
        return type;
    }
}
