package com.lessly.pattern.factory;


/**
 * 简单工厂测试类 模拟client
 */
public class TestSimpleFac {


    /**
     * 简单模式：
     * 优点：简单粗暴、无所不能
     * 缺点：负担太重，工厂方法太重，不易扩展，不遵守开闭原则
     * @param args
     */
    public static void main(String[] args) {
        Car car = SimpleFac.getCarByName("奔驰");
        System.out.println(car.getColor()+"的"+car.getName());
    }
}
