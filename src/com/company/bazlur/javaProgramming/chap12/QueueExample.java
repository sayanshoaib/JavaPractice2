package com.company.bazlur.javaProgramming.chap12;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 10; i >= 0; i--) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            Integer value = queue.poll();
            System.out.println(value + ", ");
        }
    }
}
