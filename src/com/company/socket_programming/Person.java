package com.company.socket_programming;

public class Person implements Runnable {
    String name;
    final Printer printer;
    int pages;
    Thread thread;

    public Person(String name, Printer printer, int pages) {
        this.name = name;
        this.printer = printer;
        this.pages = pages;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (printer) {
            printer.printAssignment(this);
        }
    }
}
