package com.lessly.pattern.porxy.staticed;

public class StaticedPorxyTest {


    /**
     * 静态代理
     * 只能帮助具体的人找对象
     * 不能够动态代理
     * @param args
     */
    public static void main(String[] args) {
        new MeiPoPorxy(new SingleDog()).findLove();
    }
}
