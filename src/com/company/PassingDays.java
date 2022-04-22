package com.company;

import magazine.Magazine;

import java.util.concurrent.TimeUnit;

public class PassingDays extends Thread {
    Magazine magazine;

    public PassingDays(Magazine magazine) {
        this.magazine = magazine;
    }

    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println(i++ + " days passed");
                TimeUnit.SECONDS.sleep(5);
                magazine.dayPassed();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
