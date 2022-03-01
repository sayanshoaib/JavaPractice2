package com.company.bazlur.threadProgramming.chap2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Watch implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (true) {
            printCurrentTime();
            sleepOneSecond();

            if (Thread.interrupted()) {
                System.out.println("Thread is Interrupted");
                return;
            }
        }
    }

    public void printCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
        String formattedCurrentTime = LocalDateTime.now().format(formatter);
        System.out.println(formattedCurrentTime);
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {

        }
    }

    public void shutdown() {
        this.running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        Watch watch = new Watch();
        Thread watchThread = new Thread(watch);
        watchThread.start();

        Thread.sleep(500);
        //watchThread.interrupt();
        watch.shutdown();

    }
}
