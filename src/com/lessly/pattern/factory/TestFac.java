package com.lessly.pattern.factory;


/**
 * 工厂方法模式
 * 优点：解决了简单工厂的缺点，一类工厂 只生产一类产品
 *      同时符合开闭原创，添加产品，只需要添加产品工厂，
 *      不需修改内部，符合开闭原则
 * 缺点：不能生态同一产品族的东西
 * 产品族概念：比如汽车分为 小汽车、suv、mpv
 */
public class TestFac {

    public static void main(String[] args) {
        Car car = new BmwFac().productCar();
        System.out.println(car.getColor() +"的"+ car.getName());
    }
}
