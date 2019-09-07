package com.lessly.pattern.factory.abstractfac;


/**
 * 具体suv工厂
 * 用来生产宝马、奔驰suv
 */
public class SuvFac extends AbstactCarFac {
    @Override
    public BmwCar createBmw() {
        return new BmwSuvCar();
    }

    @Override
    public BenZCar createBenz() {
        return new BenzSuvCar();
    }
}
