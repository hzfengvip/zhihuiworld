package com.lessly.concurrent;

import java.util.concurrent.TimeUnit;

public class ThreadStatus {

    //睡眠等待
    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"timeWaiting").start();


        //wait 等待
        new Thread(()->{
            while (true){
                synchronized (ThreadStatus.class){
                    try {
                        ThreadStatus.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"waiting").start();
    }





}
