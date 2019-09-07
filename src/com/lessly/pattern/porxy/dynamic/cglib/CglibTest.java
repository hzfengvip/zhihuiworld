package com.lessly.pattern.porxy.dynamic.cglib;

import com.lessly.pattern.porxy.staticed.SingleDog;

public class CglibTest {

    public static void main(String[] args) {
        try {
            SingleDog singleDog = (SingleDog) new CGLIBPorxy().getInstance(SingleDog.class);
            singleDog.findLove();
            System.out.println("------------");
            System.out.println(singleDog.getClass());
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
