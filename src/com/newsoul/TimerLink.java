package com.newsoul;

import java.util.Timer;

public class TimerLink {
    private Timer timer;
    public TimerLink (int time){
        this.timer = new Timer();
        this.timer.schedule(new TimerTask1(), time * 1000);
    }
}
