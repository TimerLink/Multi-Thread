package com.newsoul;
import java.util.Date;
import java.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class DateTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                Date now = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
                String dateString = dateFormat.format(now);
                System.out.println(dateString);
            }
        };
        // delay为long,period为long：从现在起过delay毫秒以后，每隔period毫秒执行一次。
        long period = 3000;
        timer.schedule(task, 0, period);
    }
}