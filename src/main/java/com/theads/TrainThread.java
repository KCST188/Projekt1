package com.theads;

import java.util.concurrent.TimeUnit;

public class TrainThread extends Thread {
    public void run() {
        try {
            System.out.println("Train departed");
            TimeUnit.SECONDS.sleep(30);
            System.out.println("Train arrived");
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
