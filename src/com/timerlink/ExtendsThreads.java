package com.timerlink;

public class ExtendsThreads {
    public static void main(String args[]) {
        new ExtendsThread(); // 创建一个新线程
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
