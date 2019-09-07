package com.lessly.pattern.factory.abstractfac;

/**
 * 具体工厂
 * 用来生产宝马、奔驰跑车
 */
public class SportCarFac extends AbstactCarFac{
    @Override
    public BmwCar createBmw() {
        return new BmwSportCar();
    }

    @Override
    public BenZCar createBenz() {
        return new BenZSportCar();
    }
}
