package com.company.socket_programming;

public class MainThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current THread: " + thread);
        // change current thread name
        thread.setName("My thread");
        System.out.println("After name change: " + thread);

        for (int n = 5; n > 0; n--) {
            System.out.println(n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
