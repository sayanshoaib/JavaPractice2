package com.company.bazlur.threadProgramming.chap2;

import java.util.concurrent.TimeUnit;

public class RuunableThreadDemo {
    public static void main(String[] args) {
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread = new Thread(myThreadRunnable);
        thread.setName("Runnable Thread");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("[" + i + "] inside " + Thread.currentThread().getName());
            sleepOneSecond();
        }
    }

    private static void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
