package com.company.socket_programming;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PCBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(4);
        Producer producer1 = new Producer(queue, "Producer1");
        Consumer consumer1 = new Consumer(queue, "Consumer1");
        Consumer consumer2 = new Consumer(queue, "Consumer2");


    }
}
