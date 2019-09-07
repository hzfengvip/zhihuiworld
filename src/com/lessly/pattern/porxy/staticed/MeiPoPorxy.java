package com.lessly.pattern.porxy.staticed;


/**
 * 媒婆（静态代理对象：只能帮助具体的单身狗找对象）
 */
public class MeiPoPorxy {

    private SingleDog singleDog;

    public MeiPoPorxy(SingleDog singleDog) {
        this.singleDog = singleDog;
    }


    public void findLove(){
        System.out.println("按要求寻找");
        singleDog.findLove();
        System.out.println("找到合适的了");
    }
}
