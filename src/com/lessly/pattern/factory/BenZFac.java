package com.lessly.pattern.factory;


/**
 * 具体工厂1
 */
public class BenZFac implements CarFac {
    @Override
    public Car productCar() {
        return new BenZCar();
    }
}
