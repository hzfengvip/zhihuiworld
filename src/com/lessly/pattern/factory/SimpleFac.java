package com.lessly.pattern.factory;


/**
 * 工厂类
 */
public class SimpleFac {


    public static  Car getCarByName(String name){
         if("奔驰".equals(name)){
             return new BenZCar();
         }
         if("宝马".equals(name)){
             return new BmwCar();
         }

         return null;
    }


}
