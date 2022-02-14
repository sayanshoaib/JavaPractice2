package com.company.bazlur.threadProgramming.chap2;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            doWork();
        });
        t2.start();
    }

    private static void doWork() {
        System.out.println("Doing some important work.");
    }
}
