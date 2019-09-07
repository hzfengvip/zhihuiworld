package com.lessly.pattern.factory.abstractfac;


/**
 * 抽象工厂
 * 用来生产 宝马、奔驰汽车
 */
public abstract class AbstactCarFac {


    public abstract BmwCar createBmw();

    public abstract BenZCar createBenz();
}
