package com.lessly.pattern.factory.abstractfac;


/**
 * 抽象工厂：用来生产一个产品族的产品
 * 只针对产品族，只能扩展产品族，
 */
public class TestAbstractFac {

    public static void main(String[] args) {
        SuvFac suvFac = new SuvFac();
//        BmwSuvCar car = (BmwSuvCar)suvFac.createBmw();
        BenzSuvCar car = (BenzSuvCar)suvFac.createBenz();
        System.out.println(car.getName() + car.type());
    }
}
