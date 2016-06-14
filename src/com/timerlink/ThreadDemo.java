package com.timerlink;

public class ThreadDemo {
    public static void main(String[] args){
        new NewThread();
        try {
            for (int i = 5;i>0;i--){
                System.out.println("main thread:"+i);
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
