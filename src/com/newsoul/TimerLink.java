package com.newsoul;

import java.util.Timer;

public class TimerLink {
    private Timer timer;
    public TimerLink (int time){
        this.timer = new Timer();
        this.timer.schedule(new TimerTask1(), time * 1000);
    }
    public static void main(String[] args) {
        System.out.println("timer begin....");
        new TimerLink(3);
    }
}
