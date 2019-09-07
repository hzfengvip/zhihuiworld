package com.lessly.concurrent;

import java.util.concurrent.TimeUnit;

public class InterruptDemo {

    private static int i = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("num:"+i);
        },"interruptDemo");
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();//打断
//        thread.interrupted();//复位
    }
}
