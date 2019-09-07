package com.lessly.pattern.factory;

/**
 * 具体工厂2
 */
public class BmwFac implements CarFac{
    @Override
    public Car productCar() {
        return new BmwCar();
    }
}
