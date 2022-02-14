package com.company.bazlur.threadProgramming.chap1;

public class MainThreadExample {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread name: " + currentThread.getName());
    }
}
