package com.company.socket_programming;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<String> queue;
    Thread thread;
    String name;


    public Producer(BlockingQueue<String> queue, String name) {
        this.queue = queue;
        this.name = name;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        int i =0;
        while (true) {
            try {
                if (queue.size() >= 4) {
                    System.out.println(name + " : Queue is Full..");
                    Thread.sleep(2000);
                }

                queue.put("cake " + i);
                System.out.println(name + " created cake " + i);
                i++;
                thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
