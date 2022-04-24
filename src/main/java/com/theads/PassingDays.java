package com.theads;

import magazine.Magazine;

import java.util.concurrent.TimeUnit;

public class PassingDays extends Thread {
    Magazine magazine;
    public PassingDays(Magazine magazine) {
        this.magazine = magazine;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                //System.out.println("Date is " + magazine.date);
                TimeUnit.SECONDS.sleep(5);
                magazine.dayPassed();
                magazine.date = magazine.date.plusDays(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (Magazine.IrresponsibleSenderWithDangerousGoods e) {
                e.getMessage();
            }
        }
    }
}
