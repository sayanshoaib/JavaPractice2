package com.company.socket_programming;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    BlockingQueue<String> queue;
    Thread thread;
    String name;


    public Consumer (BlockingQueue<String> queue, String name) {
        this.queue = queue;
        this.name = name;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (queue.isEmpty()) {
                    System.out.println(name + " : Queue is empty...");
                    Thread.sleep(2000);
                }
                System.out.println(name + " got " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
