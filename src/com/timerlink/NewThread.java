package com.timerlink;

class NewThread implements Runnable {
    Thread t;
    NewThread(){
        t = new Thread(this, "DemoThread");
        System.out.println("Child thread: "+t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println("child thread: "+i);
            }
            Thread.sleep(1);
        }
        catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("exiting child");
    }
}
