package com.timerlink;

/**
 * Created by Newsoul on 2016/6/14.
 */
class ExtendsThread extends Thread {
    ExtendsThread() {
        super("Demo Thread");
        System.out.println("Child thread" + this);
        start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                // 让线程休眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
